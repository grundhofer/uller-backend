package network

import ProductTokenDTO
import ProductVariant
import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.MulticastMessage
import com.google.firebase.messaging.Notification
import data.productList
import data.registeredProductList


fun initFirebase() {
//    set environment variable for credentials file
//    export GOOGLE_APPLICATION_CREDENTIALS="/home/user/Downloads/service-account-file.json"

    val options = FirebaseOptions.Builder()
        .setCredentials(GoogleCredentials.getApplicationDefault())
        .setDatabaseUrl("https://uller-app.firebaseio.com/")
        .build()
    FirebaseApp.initializeApp(options)
}

fun registerProduct(registeredProducts: ProductTokenDTO) {
    registeredProductList.add(ProductTokenDTO(registeredProducts.productId, registeredProducts.token))
}

fun unregisterProduct(registeredProducts: ProductTokenDTO) {
    registeredProductList.removeIf {
        (it.productId == registeredProducts.productId && it.token == registeredProducts.token)
    }
}

fun sendNotification(id: String) {
    val productVariant = findProduct(id)
    val tokenlist = findTokensByProductId(id)
    val message = MulticastMessage.builder()
        .setNotification(
            Notification.builder()
                .setBody("${productVariant?.name} ist verfügbar")
                .setTitle("Deal Alarm!!!")
                .build()
        )
        .putData("body", productVariant?.name)
        .addAllTokens(tokenlist)
        .build()

    val response = FirebaseMessaging.getInstance().sendMulticast(message)
    println("Successfully sent message: $response")
}

fun findProduct(id: String): ProductVariant? {
    productList.products.products.forEach { product ->
        product.variant.forEach { productVariant ->
            if (id == productVariant.productId.toString()) return productVariant
        }
    }
    return null
}

fun findTokensByProductId(id: String): MutableList<String> {
    val tokenList = mutableListOf<String>()
    registeredProductList.forEach { registeredProducts ->
        if (registeredProducts.productId == id) {
            tokenList.add(registeredProducts.token)
        }
    }
    return tokenList
}