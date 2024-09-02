package com.example.resale_site_api;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class ResaleSiteApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ResaleSiteApiApplication.class, args);
	}

	@Override
	public void run(String ...args){
		log.info("Application Started");
	};

}
