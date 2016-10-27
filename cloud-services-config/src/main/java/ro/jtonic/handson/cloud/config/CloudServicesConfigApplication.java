package ro.jtonic.handson.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudServicesConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServicesConfigApplication.class, args);
	}
}
