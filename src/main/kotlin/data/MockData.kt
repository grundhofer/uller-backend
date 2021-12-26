package data

import Description
import Product
import ProductTokenDTO
import ProductVariant
import Products
import ScrapItems
import ScrapeItems
import ScrapeList
import Shop
import kotlinx.serialization.Serializable
import org.openqa.selenium.By

// firebase client token for Pixel 3a Emulator
val registrationTokenPixel3aEmu =
    "dxPMa0XeRJKlZtqjlmU0lL:APA91bHFp_aerx8lX7MssjNTBrCXYvGUwomyVk4xnjDNwbg2Ifu9kNRCoL2V69Zbt6OyZ2ExsYgYMwa2bN9yphhIwBJqPH-zYp0nULKkLeKI5LMtCKKwhUdLmyfBmdrR4e9bMyjzg8VY"

// Pixel 3a Emulator registration on ProductId 5
var registeredProductList = mutableListOf(
    ProductTokenDTO(registrationTokenPixel3aEmu, "1")
)

val listToScrape = ScrapeList(
    listOf(
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"san_privatePageContent\"]/div[5]/div[1]/div[1]/div[2]/div"),
                "Vielen Dank an alle, die eine PlayStation 5 bestellt haben. Aktuell ist die PlayStation 5 auf otto.de leider ausverkauft.",
                5,
                "https://www.otto.de/technik/gaming/playstation/ps5/"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.className("alert--content"),
                "Leider ist der Artikel aktuell in unserem Onlineshop nicht verfügbar.",
                3,
                "https://www.euronics.de/spiele-und-konsolen-film-und-musik/spiele-und-konsolen/playstation-5/spielekonsole/playstation-5-digital-edition-konsole-4061856837833"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.className("alert--content"),
                "Leider ist der Artikel aktuell in unserem Onlineshop nicht verfügbar.",
                3,
                "https://www.euronics.de/spiele-und-konsolen-film-und-musik/spiele-und-konsolen/playstation-5/spielekonsole/playstation-5-konsole-4061856837826"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"availability\"]/span"),
                "Derzeit nicht verfügbar.",
                1,
                "https://www.amazon.de/dp/B08H98GVK8/?coliid=IUNG1CGD0ZQVJ&colid=221GI0MGD81MO&psc=0"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"availability\"]/span"),
                "Derzeit nicht verfügbar.",
                1,
                "https://www.amazon.de/dp/B08H93ZRK9/?coliid=IFM3NCUUHQCR8&colid=221GI0MGD81MO&psc=0"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"availability\"]/span"),
                "Derzeit nicht verfügbar.",
                1,
                "https://www.amazon.de/dp/B09BKB9VXD/?coliid=IFM3NCUUHQCR8&colid=221GI0MGD81MO&psc=0"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.className("mu-headline"),
                "PlayStation®5 ausverkauft",
                6,
                "https://www.mueller.de/multi-media/playstation-5/"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"product-top-right\"]/div[3]/div/div"),
                "Artikel kann derzeit nicht gekauft werden",
                2,
                "https://www.alternate.de/Sony-Interactive-Entertainment/PlayStation-5-Digital-Edition-Spielkonsole/html/product/1651221"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"product-top-right\"]/div[3]/div/div"),
                "Artikel kann derzeit nicht gekauft werden",
                2,
                "https://www.alternate.de/Sony-Interactive-Entertainment/PlayStation-5-Spielkonsole/html/product/1651220"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
                "Dieser Artikel ist aktuell nicht verfügbar.",
                4,
                "https://www.saturn.de/de/product/_sony-playstation%C2%AE5-digital-edition-2661939.html"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
                "Dieser Artikel ist aktuell nicht verfügbar.",
                4,
                "https://www.saturn.de/de/product/_sony-playstation%C2%AE5-2661938.html?"
            ),
        ),
        ScrapeItems(
            1,
            Description(
                By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
                "Dieser Artikel ist aktuell nicht verfügbar.",
                5,
                "https://www.mediamarkt.de/de/product/_sony-playstation%C2%AE5-digital-edition-2661939.html"
            ),
        ),
    )
)

@Serializable
val ps5List = Product(
    name = "Playstation 5",
    category = "ps5",
    variant =
    listOf(
        ProductVariant(
            productId = 1,
            name = "PS5 Digital",
            shopList = listOf(
                Shop(
                    shopId = 1,
                    name = "Amazon",
                    key = "amazon",
                    url = "https://www.amazon.de/dp/B08H98GVK8/?coliid=IUNG1CGD0ZQVJ&colid=221GI0MGD81MO&psc=0",
                    available = false,


                    ),
                Shop(
                    shopId = 2,
                    name = "Alternate",
                    key = "alternate",
                    url = "https://www.alternate.de/Sony-Interactive-Entertainment/PlayStation-5-Digital-Edition-Spielkonsole/html/product/1651221",
                    available = false,
                ),
                Shop(
                    shopId = 3,
                    name = "Euronics",
                    key = "euronics",
                    url = "https://www.euronics.de/spiele-und-konsolen-film-und-musik/spiele-und-konsolen/playstation-5/spielekonsole/playstation-5-digital-edition-konsole-4061856837833",
                    available = false
                ),
                Shop(
                    shopId = 4,
                    name = "Saturn",
                    key = "saturn",
                    url = "https://www.saturn.de/de/product/_sony-playstation%C2%AE5-digital-edition-2661939.html",
                    available = false
                ),
                Shop(
                    shopId = 5,
                    name = "Mediamarkt",
                    key = "mediaMarkt",
                    url = "https://www.mediamarkt.de/de/product/_sony-playstation%C2%AE5-digital-edition-2661939.html",
                    available = false,
                )
            )
        )
    )
)

val xboxList = Product(
    name = "Xbox Series X",
    category = "xbox",
    variant =
    listOf(
        ProductVariant(
            productId = 2,
            name = "Xbox Series X",
            shopList = listOf(
                Shop(
                    shopId = 1,
                    name = "Amazon",
                    key = "amazon",
                    url = "https://www.amazon.de/dp/B08H98GVK8/?coliid=IUNG1CGD0ZQVJ&colid=221GI0MGD81MO&psc=0",
                    available = false,


                    )
            )
        )
    )
)

val gpuList = Product(
    name = "Graphic Card",
    category = "gpu",
    variant =
    listOf(
        ProductVariant(
            productId = 3,
            name = "Graphic Card",
            shopList = listOf(
                Shop(
                    shopId = 1,
                    name = "Amazon",
                    key = "amazon",
                    url = "https://www.amazon.de/dp/B08H98GVK8/?coliid=IUNG1CGD0ZQVJ&colid=221GI0MGD81MO&psc=0",
                    available = false,
                )
            )
        )
    )
)

val switchList = Product(
    name = "Nintendo Switch",
    category = "nintendoswitch",
    variant =
    listOf(
        ProductVariant(
            productId = 4,
            name = "Nintendo Switch",
            shopList = listOf(
                Shop(
                    shopId = 1,
                    name = "Amazon",
                    key = "amazon",
                    url = "https://www.amazon.de/dp/B08H98GVK8/?coliid=IUNG1CGD0ZQVJ&colid=221GI0MGD81MO&psc=0",
                    available = false,
                )
            )
        )
    )
)

var productList = ScrapItems(
    Products(
        listOf(
            ps5List,
            xboxList,
            switchList,
            gpuList
        )
    )
)
