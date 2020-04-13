package com.anshul

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

//fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
//
//@Suppress("unused") // Referenced in application.conf
//@kotlin.jvm.JvmOverloads
//fun Application.module() {
//    val client = HttpClient() {
//    }
//
//    install(CORS) {
//        method(HttpMethod.Options)
//        method(HttpMethod.Put)
//        method(HttpMethod.Delete)
//        method(HttpMethod.Patch)
//        header(HttpHeaders.Authorization)
//        header("MyCustomHeader")
//        allowCredentials = true
//        anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
//    }
//
//    routing {
//        get("/") {
//            call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
//        }
//    }
//}

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8080, module = Application::module).start(true)
}

fun Application.module(){
    routing {
        get  ("/" ){
            call.respond(status = HttpStatusCode.OK, message = "HELLO WORLD!")
        }
    }
}
