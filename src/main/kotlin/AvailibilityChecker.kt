import org.openqa.selenium.PageLoadStrategy
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.CapabilityType
import java.awt.Toolkit
import kotlin.random.Random

class AvailibilityChecker {

    private val options = ChromeOptions()
    lateinit var webDriver: ChromeDriver
    var itemFound: Boolean = false
    val waitingTimeMilis = 5000

    fun setupDriver() {
        options.setAcceptInsecureCerts(true)
        options.addArguments("--disable-gpu");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true)
        options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true)
        options.setCapability("profile.default_content_settings.cookies", 2)
        webDriver = ChromeDriver(options)
        println("driver init")
    }

    fun searchItem(key: String, url: String, description: List<Description>) {
        webDriver.get(url)
        Thread.sleep(waitingTimeMilis + Random.nextInt(1, 2000).toLong())
        if (findWithSelector(description)) println("at least one found") else {
            println(" $url ")
            itemFound = true
            var i = 1
            while (i < 10) {
                Toolkit.getDefaultToolkit().beep()
                i++
                Thread.sleep(500)
            }
            webDriver.quit()
        }
        Thread.sleep(waitingTimeMilis + Random.nextInt(1, 2000).toLong())
    }


    private fun findWithSelector(description: List<Description>): Boolean {
        var atLeastOneFound = false
        description.forEach { description ->
            try {
                val item = webDriver.findElement(description.selector)
                println()
                println("Selector ${description.selector}: ${item.text} value in element found")
                if (item.text.contains(description.text)) {
                    atLeastOneFound = true
                    println("found $description.text")
                } else throw Exception()
            } catch (e: Exception) {
            }
        }
        return atLeastOneFound
    }
}