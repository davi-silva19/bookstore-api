package com.davisilva.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davisilva.bookstore.services.BDService;

@Configuration
@Profile("test")
public class TestConfig {
	@Autowired
	
	private BDService bdService;
	
	@Bean
	public void instanciaBasedeDados() {
		this.bdService.instanciaBasedeDados();
	}
}
