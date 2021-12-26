package network

import ClientInterface
import ProductTokenDTO
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.content.*
import io.ktor.request.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.serialization.json.Json
import org.slf4j.event.Level

fun startRestService() {
    val clientInterface = ClientInterface()
    embeddedServer(Netty, port = 8081) {
        install(CallLogging) {
            level = Level.DEBUG
        }
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
            })
        }
        routing {
            get("/") {
                call.respondText("Hello, world!")
            }
            post("/subscription") {
                lateinit var fbToken: String
                lateinit var productId: String
                lateinit var subscribeProduct: String
                val multipartData = call.receiveMultipart()
                multipartData.forEachPart { part ->
                    when (part) {
                        is PartData.FormItem -> {
                            when (part.name) {
                                "token" -> fbToken = part.value
                                "productId" -> productId = part.value
                                "subscribe" -> subscribeProduct = part.value
                            }
                        }
                    }
                }
                if (subscribeProduct.toBoolean()) {
                    registerProduct(ProductTokenDTO(productId, fbToken))
                    call.respond(clientInterface.returnStatus(true))
                    println("product $productId registered")
                } else {
                    unregisterProduct(ProductTokenDTO(fbToken, productId))
                    call.respond(clientInterface.returnStatus(true))
                    println("product $productId unregistered")
                }
            }
            get("/productlist") {
                call.respond(clientInterface.getProductList())
            }
            get("/notification") {
                val productId = call.request.queryParameters["productId"]
                if (productId != null) {
                    sendNotification(productId)
                    call.respondText("Notification for ProductId:$productId send")
                }
            }
        }
    }.start(wait = false)
}