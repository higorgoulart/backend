package com.satc.satcloja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SatcLojaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SatcLojaApplication.class, args);
	}
}
