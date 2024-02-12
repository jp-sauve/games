package ca.grokology

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option

class CliParser: CliktCommand() {
    val adminUsername: String? by option("-u", "--username", help = "username")
    val adminPassword: String? by option("-p", "--password", help = "password")
    override fun run() {
        echo("opt=$opt")
        TODO("Not yet implemented")
    }
}