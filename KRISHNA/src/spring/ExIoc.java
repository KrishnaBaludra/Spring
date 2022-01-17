package spring;

import java.beans.Beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Honda {

	private int cc;
	private String name;
	private String type;

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

	@Override
	public String toString() {
		return "Honda [cc=" + cc + ", name=" + name + ", type=" + type + "]";
	}

	
}

public class ExIoc {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/beans1.xml");
		Honda car1 = (Honda) context.getBean("car");
		System.out.println(car1);
	}
}
