package com.makingdevs.apirest2.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {
    @GetMapping("/home")
    @ResponseBody
    def index() {
        "Hola Mundo"
    }
}
