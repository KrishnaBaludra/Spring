package spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

class Car1 {
	int cc;
	String name;
	String type;
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}

class Car2{
	
}

@Configuration
class Configrationclass{
	@Bean
	public Car1 getCar() {
		return new Car1();
	}
}
public class Ex1Javaconfig {

}
