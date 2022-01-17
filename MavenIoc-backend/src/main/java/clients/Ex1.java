package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import classfile.Car;
import javaconfig.IocEx1;

public class Ex1 {
	public static void main(String[] args) {
		
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(IocEx1.class);
		Car car = ctxt.getBean("c",Car.class);
		System.out.println(car);
	}
}
