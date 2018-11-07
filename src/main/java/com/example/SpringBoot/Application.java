package com.example.SpringBoot;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private static Logger logger = LoggerFactory.getLogger(Application.class);
	public static void main(String[] args) {
		System.out.println(logger);
		SpringApplication.run(Application.class, args);
		logger.error("log4j2!");
	}
}
