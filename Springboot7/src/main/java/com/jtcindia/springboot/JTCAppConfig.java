package com.jtcindia.springboot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JTCAppConfig {
	@Bean
	public Hai getHai() {
		 Hai hai=new Hai();
		 return hai;
	}
	@Bean
	public Hello getHello() {
		return new Hello();
	}
}
