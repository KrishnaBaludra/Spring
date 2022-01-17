package spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

interface Sim{
	public void browsing();
	public void calling();
	
}

class Jsim implements Sim{
	public void browsing() {
		System.out.println("jio browse");
	}
	public void calling() {
		System.out.println("jio calling");
	}
		
}

class Moblie {
	Sim sim;

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}
	
	public void call() {
		sim.browsing();
	}
	public void browse() {
		sim.calling();
	}

	@Override
	public String toString() {
		return "Moblie [sim=" + sim + "]";
	}
	
	
	
	
}
public class Ex2Autowire {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("auto.xml");
		Moblie mob = (Moblie)ac.getBean("mobile");
		System.out.println(mob);
	}
}
