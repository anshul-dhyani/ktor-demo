package com.anshul

import com.anshul.modules.restModule
import io.ktor.application.Application

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    restModule()
}
