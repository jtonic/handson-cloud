package ro.jtonic.handson

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class CloudOrganizationApplication

fun main(args: Array<String>) {
    SpringApplication.run(CloudOrganizationApplication::class.java, *args)
}
