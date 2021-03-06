package com.davisilva.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.davisilva.bookstore.services.BDService;

@Configuration
@Profile("dev")
public class DevConfig {
	@Autowired
	private BDService bdService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;
	
	@Bean
	public boolean instanciaBaseDeDados() {
		if (strategy.equals("create")) {
			this.bdService.instanciaBasedeDados();
		}
		return false;
	}
}
