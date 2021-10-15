package com.springboot.springconsul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableConfigurationProperties(value = Config.class)
public class SpringConsulApplication {

	@Autowired
	private Config config;

	@GetMapping("/getConfig")
	public Config getConfiguration() {

		return config;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringConsulApplication.class, args);
	}

}
