package com.ltts.playerproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages ="com.ltts.playerproj.controller,"+"com.ltts.playerproj.bo,"+"com.ltts.playerproj.model,"+"com.ltts.playerproj")
public class PlayerprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerprojApplication.class, args);
	}

}
