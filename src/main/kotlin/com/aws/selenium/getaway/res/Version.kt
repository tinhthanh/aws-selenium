package com.aws.selenium.getaway.res

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Version {
    @GetMapping("/version")
    fun version(): ResponseEntity<*> {
        return ResponseEntity.ok("1.0")
    }
}
