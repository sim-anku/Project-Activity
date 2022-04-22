package com.ltts.serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerconfigApplication.class, args);
	}

}
