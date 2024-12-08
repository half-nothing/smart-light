package cn.half.nothing.smartlight

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [JacksonAutoConfiguration::class])
class SmartLightApplication

fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    runApplication<SmartLightApplication>(*args)
}
