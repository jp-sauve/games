package ca.grokology.plugins

import com.fasterxml.jackson.databind.*
import io.ktor.serialization.jackson.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
        jackson {
                enable(SerializationFeature.INDENT_OUTPUT)
            }
    }
//    routing {
//    }
}
