package clients;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import classfile.Bus;
import javaconfig.Busconfig;


public class BusClientpgr {
	public static void main(String[] args) {
		ApplicationContext txt = new AnnotationConfigApplicationContext(Busconfig.class);
		Bus b1 = (Bus)txt.getBean("bus");
		System.out.println(b1);
	}
}
