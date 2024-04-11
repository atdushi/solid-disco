package com.virtualpairprogrammers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class TinkoffApplication {
	public static void main(String[] args) {
		SpringApplication.run(TinkoffApplication.class, args);
		System.out.println("SpringVersion " + SpringVersion.getVersion()); //4.2.5.RELEASE
	}
}
