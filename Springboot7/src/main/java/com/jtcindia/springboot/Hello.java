package com.jtcindia.springboot;
import org.springframework.stereotype.Service;
@Service
public class Hello {
	public Hello() {
		System.out.println("Hello-D.C");
	}
	public void show() {
		System.out.println("Hello-show()");
	}
}
