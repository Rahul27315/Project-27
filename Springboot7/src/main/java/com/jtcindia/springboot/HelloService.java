package com.jtcindia.springboot;
import org.springframework.stereotype.Service;
@Service
public class HelloService {
	public HelloService() {
		System.out.println("HelloService-D.C");
	}
	public void show() {
		System.out.println("HelloService-show()");
	}
}
