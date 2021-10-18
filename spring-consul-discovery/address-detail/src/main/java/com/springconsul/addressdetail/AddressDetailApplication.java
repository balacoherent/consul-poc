package com.springconsul.addressdetail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AddressDetailApplication {

	@GetMapping("/address")
	public String getMessage(){
		 return " address details";
	}

	public static void main(String[] args) {
		SpringApplication.run(AddressDetailApplication.class, args);
	}

}
