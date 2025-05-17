package com.jtcindia.springboot;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages ={"com.jtcindia.springboot"})
public class MyBootApp implements CommandLineRunner{
	@Autowired
	Hello hello;	
	@Autowired
	Hai hai;	
	@Autowired
	HelloService helloservice;
	@Autowired
	HelloDAO helloDAO;
	@Autowired
	DataSource myds;
	public static void main(String[] args) {
		//Do your Start-Up Task Here
		System.out.println("MyBootApp-Main() begin");
		SpringApplication.run(MyBootApp.class, args);
		System.out.println("My Boot App-Main() end");
	}
	@Override
	public void run(String... args) throws Exception {
		//Do your Start-Up Tasks Here
		System.out.println("I am run()CLR-doing Start-Up Task");
		System.out.println("CLR-run()-Begin");
		hello.show();
		hai.show();
		helloservice.show();
		helloDAO.show();
		Connection con=myds.getConnection();
		DatabaseMetaData dbmd=con.getMetaData();
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println("CLR-run()-End");	
	}	
}
