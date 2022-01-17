package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import classfile.Car;


public class IocEx1 {
	@Bean
	public Car c() {
		Car car = new Car();
		car.setName("Baleno");
		car.setCc(1600);
		return car;
	}
}
