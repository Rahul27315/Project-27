package com.jtcindia.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
@SpringBootApplication(scanBasePackages="com.jtcindia.springboot" )
public class StartMyBootApp extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(StartMyBootApp.class,args);
	}
}
