package com.jtcindia.springboot;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MyBootApp implements CommandLineRunner {
	@Autowired
	CustomerDAO cdao;
	public static void main(String[] args) {
		SpringApplication.run(MyBootApp.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyBootApp..run()method--starts");
		System.out.println("---------------------");
		// 1.add Customer
		Customer cust = new Customer(715, "Rahul", "rahulisha", 1111, "Delhi");
		cdao.addCustomer(cust);
		// 2.getAllCustomers
		System.out.println("getAllCustomers");
		List<Customer> list = cdao.getAllCustomers();
		list.forEach(cust1 -> System.out.println(cust1));
		System.out.println("-----------------------------");
		System.out.println("MyBootApp...run() method-----Ends");
	}
}
