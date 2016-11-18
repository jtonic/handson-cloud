package ro.jtonic.handson

import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.h2.server.web.WebServlet

@Configuration
open class ServletsRegistrationConfigurer {

    @Bean
    open fun h2servletRegistration(): ServletRegistrationBean {
        val registration = ServletRegistrationBean(WebServlet())
        registration.addUrlMappings("/console/*")
        return registration
    }

}
