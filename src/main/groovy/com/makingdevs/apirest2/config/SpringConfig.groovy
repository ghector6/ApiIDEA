package com.makingdevs.apirest2.config

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

@EnableWebMvc
@ComponentScan(basePackages = ["com.makingdevs.apirest2.controllers"])
@Configuration
class SpringConfig {
}
