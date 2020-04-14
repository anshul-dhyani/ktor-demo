package com.anshul.routings

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.routing

fun Application.helloRouting() {
    routing {
        helloWorld()
        byeWorld()
    }
}

private fun Routing.helloWorld() {
    get("/") {
        call.respond(status = HttpStatusCode.OK, message = Responses("Hello world!"))
    }
}

private fun Routing.byeWorld() {
    get("/bye") {
        call.respond(status = HttpStatusCode.OK, message = "Bye WORLD!")
    }
}

data class Responses(val message: String)