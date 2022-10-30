package ru.hikefood.ration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RationApplication

fun main(args: Array<String>) {
	runApplication<RationApplication>(*args)
}
