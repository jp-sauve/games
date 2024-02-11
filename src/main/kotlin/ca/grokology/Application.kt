package ca.grokology

import ca.grokology.db.DatabaseSingleton
import ca.grokology.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureHTTP()
    DatabaseSingleton.init()
    configureSerialization()
    configureSecurity()
    configureSockets()
    configureRouting()
}
