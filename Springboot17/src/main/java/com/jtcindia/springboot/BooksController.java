package com.jtcindia.springboot;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BooksController {
	@GetMapping("/showBooks")
	public String getBooks(HttpSession session) {
		System.out.println("BooksController-getBooks()");
		List<Book> blist=new ArrayList<>();
		Book mybook1=new Book(101,"Master Spring Boot","Rahul",BigDecimal.valueOf(1000.00),"JTC");
		Book mybook2=new Book(102,"Master MicroServices","Bhaargavi",BigDecimal.valueOf(1200.00),"JTC");
		Book mybook3=new Book(103,"Master Angular","Isha",BigDecimal.valueOf(1350.00),"JTC");
		Book mybook4=new Book(104,"Master React","Dhurvi",BigDecimal.valueOf(1150.00),"JTC");
		Book mybook5=new Book(105,"Master Java Full Stack","Manavi",BigDecimal.valueOf(1450.00),"JTC");
		blist.add(mybook1);
		blist.add(mybook2);
		blist.add(mybook3);
		blist.add(mybook4);
		blist.add(mybook5);
		session.setAttribute("MyBooks",blist);
		return "bookslist";		
	}
}
