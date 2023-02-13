package com.inventario1.inventario1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.inventario1.inventario1.controllers.ClientController;

@SpringBootApplication

public class Inventario1Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		System.setProperty("server.port", "8081");
		SpringApplication.run(Inventario1Application.class, args);
	}

}
