package com.jtcindia.springboot;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MyBootApp implements CommandLineRunner{
	@Autowired
	CustomerDAO cdao;
	public static void main(String[] args) {
		SpringApplication.run(MyBootApp.class, args);		
	}	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyBootApp.run()method--starts");
		System.out.println("-------------------------------");
		Customer cust=new Customer(101,"Rahul","rahulisha",1111,"Noida");
		cdao.addCustomer(cust);
		System.out.println("getAllCustomers");
		List<Customer> list=cdao.getAllCustomers();
		list.forEach(customer->System.out.println(cust));
		System.out.println("------------------------------------");
		System.out.println("MyBootApp.run()method-----Ends");		
	}
}
