package com.example.monitoring

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    @GetMapping("/1")
    fun test1(): String{
        return "Test API 1"
    }

    @PostMapping("/2")
    fun test2(): String {
        return "Test API 2"
    }
}