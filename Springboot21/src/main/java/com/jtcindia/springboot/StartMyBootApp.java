package com.jtcindia.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@SpringBootApplication(scanBasePackages="com.jtcindia.springboot")
@EnableWebMvc
@EnableTransactionManagement
public class StartMyBootApp extends SpringBootServletInitializer{
	public static void main(String[] args) {
		System.out.println("-------------------------------------");
		SpringApplication.run(StartMyBootApp.class,args);
		System.out.println("*****************************************");
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(StartMyBootApp.class);
	}
}
