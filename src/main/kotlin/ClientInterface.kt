import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import org.openqa.selenium.By



//    OTTO(
//        key = "Otto",
//        items = listOf(
//            Item(
//                key = "Otto PS5",
//                url = "https://www.otto.de/technik/gaming/playstation/ps5/",
//                description = listOf(
//                    Description(
//                        By.xpath("//*[@id=\"san_privatePageContent\"]/div[5]/div[1]/div[1]/div[2]/div"),
//                        "Vielen Dank an alle, die eine PlayStation 5 bestellt haben. Aktuell ist die PlayStation 5 auf otto.de leider ausverkauft."
//                    )
//                )
//            )
//        )
//    ),
//        EURONICS(
//        key = "Euronics",
//        items = listOf(
//        Item(
//        key = "Euronics PS5 Digital",
//        url = "https://www.euronics.de/spiele-und-konsolen-film-und-musik/spiele-und-konsolen/playstation-5/spielekonsole/playstation-5-digital-edition-konsole-4061856837833",
//        description = listOf(
//        Description(
//        By.className("alert--content"),
//        "Leider ist der Artikel aktuell in unserem Onlineshop nicht verfügbar."
//        )
//        )
//        ),
//        Item(
//        key = "Euronics PS5 Laufwerk",
//        url = "https://www.euronics.de/spiele-und-konsolen-film-und-musik/spiele-und-konsolen/playstation-5/spielekonsole/playstation-5-konsole-4061856837826",
//        description = listOf(
//        Description(
//        By.className("alert--content"),
//        "Leider ist der Artikel aktuell in unserem Onlineshop nicht verfügbar."
//        )
//        )
//        )
//        )
//        ),
//        AMAZON(
//        key = "Amazon",
//        items = listOf(
//        Item(
//        key = "Amazon PS5 Digital",
//        url = "https://www.amazon.de/dp/B08H98GVK8/?coliid=IUNG1CGD0ZQVJ&colid=221GI0MGD81MO&psc=0",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"availability\"]/span"),
//        "Derzeit nicht verfügbar."
//        )
//        )
//        ),
//        Item(
//        key = "Amazon PS5 Laufwerk",
//        url = "https://www.amazon.de/dp/B08H93ZRK9/?coliid=IFM3NCUUHQCR8&colid=221GI0MGD81MO&psc=0",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"availability\"]/span"),
//        "Derzeit nicht verfügbar."
//        )
//        )
//        ),
//        Item(
//        key = "Amazon PS5 Laufwerk B",
//        url = "https://www.amazon.de/dp/B09BKB9VXD/?coliid=IFM3NCUUHQCR8&colid=221GI0MGD81MO&psc=0",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"availability\"]/span"),
//        "Derzeit nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"availability\"]/span"),
//        "Derzeit nicht auf Lager."
//        )
//        )
//        )
//        )
//        ),
//        MUELLER(
//        key = "Müller",
//        items = listOf(
//        Item(
//        key = "Müller PS5",
//        url = "https://www.mueller.de/multi-media/playstation-5/",
//        description = listOf(
//        Description(
//        By.className("mu-headline"),
//        "PlayStation®5 ausverkauft"
//        )
//        )
//        )
//        )
//        ),
//        ALTERNATE(
//        key = "Alternate",
//        items = listOf(
//        Item(
//        key = "Alternate PS5 Digital",
//        url = "https://www.alternate.de/Sony-Interactive-Entertainment/PlayStation-5-Digital-Edition-Spielkonsole/html/product/1651221",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"product-top-right\"]/div[3]/div/div"),
//        "Artikel kann derzeit nicht gekauft werden"
//        )
//        )
//        ),
//        Item(
//        key = "Alternate PS5 Laufwerk",
//        url = "https://www.alternate.de/Sony-Interactive-Entertainment/PlayStation-5-Spielkonsole/html/product/1651220",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"product-top-right\"]/div[3]/div/div"),
//        "Artikel kann derzeit nicht gekauft werden"
//        )
//        )
//        )
//        )
//        ),
//        SATURN(
//        key = "Saturn",
//        items = listOf(
//        Item(
//        key = "Saturn PS5 Digital",
//        url = "https://www.saturn.de/de/product/_sony-playstation%C2%AE5-digital-edition-2661939.html",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
//        "Dieser Artikel ist aktuell nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
//        "Leider keine Lieferung möglich"
//        )
//        )
//        ),
//        Item(
//        key = "Saturn PS5 Laufwerk",
//        url = "https://www.saturn.de/de/product/_sony-playstation%C2%AE5-2661938.html?",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
//        "Dieser Artikel ist aktuell nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
//        "Leider keine Lieferung möglich"
//        )
//        )
//        ),
//        Item(
//        key = "Saturn PS5 Digital Dualsense",
//        url = "https://www.saturn.de/de/product/_sony-ps5-digital-edition-dualsense%E2%84%A2-2757014.html",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
//        "Dieser Artikel ist aktuell nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
//        "Leider keine Lieferung möglich"
//        )
//        )
//        )
//        )
//        ),
//        MEDIAMARKT(
//        key = "Mediamarkt",
//        items = listOf(
//        Item(
//        key = "Mediamarkt PS5 Digital",
//        url = "https://www.mediamarkt.de/de/product/_sony-playstation%C2%AE5-digital-edition-2661939.html",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
//        "Dieser Artikel ist aktuell nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
//        "Leider keine Lieferung möglich"
//        )
//        )
//        ),
//        Item(
//        key = "Mediamarkt PS5 Laufwerk",
//        url = "https://www.mediamarkt.de/de/product/_sony-playstation%C2%AE5-2661938.html",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
//        "Dieser Artikel ist aktuell nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
//        "Leider keine Lieferung möglich"
//        )
//        )
//        ),
//        Item(
//        key = "Mediamarkt PS5 Laufwerk Dualsense",
//        url = "https://www.mediamarkt.de/de/product/_sony-playstation%C2%AE5-dualsense%E2%84%A2-2752998.html",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
//        "Dieser Artikel ist aktuell nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
//        "Leider keine Lieferung möglich"
//        )
//        )
//        ),
//        Item(
//        key = "Mediamarkt PS5 Laufwerk Spiderman",
//        url = "https://www.mediamarkt.de/de/product/_sony-ps5-marvel-s-spider-man-miles-morales-2715827.html",
//        description = listOf(
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
//        "Dieser Artikel ist aktuell nicht verfügbar."
//        ),
//        Description(
//        By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
//        "Leider keine Lieferung möglich"
//        )
//        )
//        )
//
//        )
//        )
//    }

@Serializable
data class ScrapItems(
    val productList: List<Product>
)

@Serializable
data class Product(
    val name: String,
    val category: String,
    val variant: List<ProductVariant>
)

@Serializable
data class ProductVariant(
    val productId: Int,
    val name: String,
    val shopList: List<Shop>
)

@Serializable
data class Shop(
    val shopId: Int,
    val name: String,
    val key: String,
    val url: String,
    val available: Boolean,
    val description: List<Description>
)

@Serializable
data class Description(
    val selector: @Contextual By,
    val text: String
)

@Serializable
val ps5List = Product(
    name = "PS5",
    category = "PS5",
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
                    url = "",
                    available = false,
                    description = listOf(
                        Description(
                            By.xpath("//*[@id=\"availability\"]/span"),
                            "Derzeit nicht verfügbar."
                        )
                    )

                ),
                Shop(
                    shopId = 2,
                    name = "Alternate",
                    key = "alternate",
                    url = "",
                    available = false,
                    description = listOf(
                        Description(
                            By.xpath("//*[@id=\"product-top-right\"]/div[3]/div/div"),
                            "Artikel kann derzeit nicht gekauft werden"
                        )
                    )

                ),
                Shop(
                    shopId = 2,
                    name = "Alternate",
                    key = "alternate",
                    url = "",
                    available = false,
                    description = listOf(
                        Description(
                            By.xpath("//*[@id=\"product-top-right\"]/div[3]/div/div"),
                            "Artikel kann derzeit nicht gekauft werden"
                        )
                    )

                ),
                Shop(
                    shopId = 3,
                    name = "Euronics",
                    key = "euronics",
                    url = "",
                    available = false,
                    description = listOf(
                        Description(
                            By.className("alert--content"),
                            "Leider ist der Artikel aktuell in unserem Onlineshop nicht verfügbar."
                        )
                    )
                ),
                Shop(
                    shopId = 4,
                    name = "Saturn",
                    key = "saturn",
                    url = "",
                    available = false,
                    description = listOf(
                        Description(
                            By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
                            "Dieser Artikel ist aktuell nicht verfügbar."
                        ),
                        Description(
                            By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
                            "Leider keine Lieferung möglich"
                        )
                    )
                ),
                Shop(
                    shopId = 5,
                    name = "Mediamarkt",
                    key = "mediaMarkt",
                    url = "",
                    available = false,
                    description = listOf(
                        Description(
                            By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/span"),
                            "Dieser Artikel ist aktuell nicht verfügbar."
                        ),
                        Description(
                            By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[1]/div/div[4]/div/div/div[3]/div/div[1]/div[1]/span"),
                            "Leider keine Lieferung möglich"
                        )
                    )
                )
            )
        )
    )
)

//
//@Serializable
//data class ProductList(
//    val productList: List<Product>,
//)
//
//@Serializable
//data class Product(
//    val id: String,
//    val name: String,
//    val description: String,
//    val shopProductList: List<ShopProduct>
//)
//
//@Serializable
//data class ShopProduct(
//    val id: String,
//    val url: String
//)

var idCounter = 1
fun getUdid() = (idCounter++).toString()

//@Serializable
//val productList = ProductList(
//    listOf(
//        Product(
//            "ps5", "PS5", "Tolle PS5 Konsole haha", listOf(
//                ShopProduct(
//                    getUdid(), "http://hiertollershop.de"
//                )
//            )
//        ),
//        Product(
//            "Wii", "wii", "Tolle wii Konsole haha", listOf(
//                ShopProduct(
//                    getUdid(), "http://hiertollershop.de"
//                )
//            )
//        ),
//        Product(
//            "Xbox", "xbox", "Tolle xbox Konsole haha", listOf(
//                ShopProduct(
//                    getUdid(), "http://hiertollershop.de"
//                )
//            )
//        )
//    )
//)

val availabilityDatabase = mutableMapOf<String, Boolean>()

//fun scrape() {
//    ps5List.variant.productList.forEach { product ->
//        product.shopProductList.forEach { shopProduct ->
//            availabilityDatabase[shopProduct.id] = true
//        }
//    }
//}

class ClientInterface {

    fun getAvailability(shopProductId: String) = availabilityDatabase[shopProductId] ?: false

    fun getProductList() = ps5List
}