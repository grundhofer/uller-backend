import io.ktor.application.*
import io.ktor.features.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import kotlinx.serialization.json.Json


fun main(args: Array<String>) {
//    val checker = AvailibilityChecker()
//    checker.setupDriver()

        val clientInterface = ClientInterface()
        embeddedServer(Netty, port = 8080) {
            install(ContentNegotiation) {
                json(Json {
                    prettyPrint = true
                })
            }
            routing {
                get("/") {
                    call.respondText("Hello, world!")
                }
                get("/productlist") {
                    call.respond(clientInterface.getProductList())
                }
            }
        }.start(wait = false)

//    while (!AvailibilityChecker().itemFound) {
//        Shop.values().forEach {
//            it.items.forEach {
//                checker.searchItem(it.key, it.url, it.description)
//            }
//        }
//    }
    }