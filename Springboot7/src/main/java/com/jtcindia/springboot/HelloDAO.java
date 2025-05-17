package com.jtcindia.springboot;
import org.springframework.stereotype.Repository;
@Repository
public class HelloDAO {
	public HelloDAO() {
		System.out.println("HelloDAO-D.C");
	}
	public void show() {
		System.out.println("HelloDAO-show()");
	}
}
