package ca.grokology

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option

class CliParser: CliktCommand() {
    val adminUsername: String? by option("-u", "--username", help = "username", envvar = "UNTRIVIAL_DB_ADMIN_USERNAME")
    val adminPassword: String? by option("-p", "--password", help = "password", envvar = "UNTRIVIAL_DB_ADMIN_PASSWORD")
    override fun run() {
        echo("opt=$opt")
        TODO("Not yet implemented")
    }
}