package BookStore.springboot.withMvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = {"BookStore.springboot.withMvc"})
@EnableWebMvc
//@EnableTransactionManagement
public class StartMyBootApp extends SpringBootServletInitializer {
	public static void main(String[] args) {
		System.out.println("My Boot App start here...");
		SpringApplication.run(StartMyBootApp.class,args);
		System.out.println("My Boot App end here...");
	}
}