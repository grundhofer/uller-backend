package logic

import ClientInterface
import Description
import ScrapeItems
import data.listToScrape
import network.sendNotification
import org.openqa.selenium.PageLoadStrategy
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import kotlin.random.Random

class AvailabilityChecker {
    private val options = ChromeOptions()
    lateinit var webDriver: ChromeDriver
    val waitingTimeMilis = 5000

    fun startAvailabilityChecker() {
        val checker = AvailabilityChecker()
        checker.setupDriver()
        while (true) {
            try {
                listToScrape.scrapeList.forEach { ScrapeItems ->
                    checker.searchItem(ScrapeItems)
                }
            } catch (e: Exception) {
                checker.closeDriver()
                startAvailabilityChecker()
            }
        }
    }

    private fun setupDriver() {
        options.setAcceptInsecureCerts(true)
        options.addArguments("--disable-gpu")
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL)
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true)
        options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true)
        options.setCapability("profile.default_content_settings.cookies", 2)
        webDriver = ChromeDriver(options)
        println("driver init")
    }

    private fun closeDriver() {
        webDriver.close()
    }

    private fun searchItem(scrapeItems: ScrapeItems) {
        webDriver.get(scrapeItems.description.productUrl)
        slowDown()
        if (findWithSelector(scrapeItems.description)) {
            println("at least one found - product unavailable")
            slowDown()
        } else {
            println(" ${scrapeItems.description.productUrl} ")
            itemFoundAction(scrapeItems)
        }
    }

    private fun slowDown() {
        Thread.sleep(waitingTimeMilis + Random.nextInt(1, 2000).toLong())
    }

    private fun itemFoundAction(scrapeItems: ScrapeItems) {
        try {
            updateProductList(scrapeItems)
            sendNotification(scrapeItems.productId.toString())
        } catch (e: Exception) {
            println("itemFoundAction failed")
        }
    }

    private fun updateProductList(scrapeItems: ScrapeItems) {
        val clientInterface = ClientInterface()
        val productList = clientInterface.getProductList()
        productList.products.products.forEach { product ->
            product.variant.forEach { productVariant ->
                if (productVariant.productId == scrapeItems.productId) {
                    productVariant.shopList.forEach { shop ->
                    if (shop.shopId == scrapeItems.description.shopId)
                        shop.available = true
                    }
                }
            }
        }
    }

    private fun findWithSelector(description: Description): Boolean {
        var atLeastOneFound = false
        try {
            val item = webDriver.findElement(description.selector)
            println()
            println("Selector ${description.selector}: ${item.text} value in element found")
            if (item.text.contains(description.text)) {
                atLeastOneFound = true
                println("found $description.text")
            } else throw Exception()
        } catch (e: Exception) { }
        return atLeastOneFound
    }
}