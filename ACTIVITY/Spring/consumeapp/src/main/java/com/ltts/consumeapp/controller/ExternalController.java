package com.ltts.consumeapp.controller;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
public class ExternalController {
	@RequestMapping("players")
	public String  m1() {
		RestTemplate rt=new RestTemplate();
		return rt.getForObject("http://localhost:8089/ext_players",String.class);
	}
	@RequestMapping("players/{id}")
	public Flux<String> m2(@PathVariable("id") int id) {
		WebClient wc=WebClient.create();
		return wc.get()
				.uri("http://localhost:8089/ext_players/"+id)
				.retrieve()
				.bodyToFlux(String.class);
		
		}

}
