package com.aws.selenium.getaway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.aws"])
class GetawayApplication

fun main(args: Array<String>) {
    runApplication<GetawayApplication>(*args)
}
