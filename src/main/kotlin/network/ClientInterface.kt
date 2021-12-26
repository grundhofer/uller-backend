import data.productList
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import org.openqa.selenium.By

@Serializable
data class ScrapItems(
    val products: Products
)

@Serializable
data class Products(
    val products: List<Product>
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
    var available: Boolean,
)

@Serializable
data class ScrapeList(
    val scrapeList: List<ScrapeItems>
)

@Serializable
data class ScrapeItems(
    val productId: Int,
    val description: Description
)

@Serializable
data class Description(
    val selector: @Contextual By,
    val text: String,
    val shopId: Int,
    val productUrl: String,
)

@Serializable
data class StatusDTO(
    val status: String
)

@Serializable
data class ProductTokenDTO(
    val token: String,
    val productId: String,
)

class ClientInterface {
    fun getProductList() = productList
    fun returnStatus(isSuccess: Boolean) = StatusDTO(if (isSuccess) "success" else "failed")
}