package com.feriodev.spring.cloud.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudEurekaServerApplication.class, args);
	}

}
