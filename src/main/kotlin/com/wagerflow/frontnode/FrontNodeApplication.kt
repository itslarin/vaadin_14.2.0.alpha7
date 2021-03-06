package com.wagerflow.frontnode

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan



@SpringBootApplication
class FrontNodeApplication


fun main(args: Array<String>) {
	runApplication<FrontNodeApplication>(*args)
}


