package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.gcu")
public class Cst323ActivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cst323ActivityApplication.class, args);
	}

}
