package com.revature.p2.waaik.com.revature.p2.musicme;

import com.revature.p2.waaik.com.revature.p2.musicme.security.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class Application extends SecurityConfig {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
