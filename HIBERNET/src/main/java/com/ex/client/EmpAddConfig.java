package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.Address;
import com.ex.entity.EmpAdd;

public class EmpAddConfig {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		EmpAdd e1 = new EmpAdd();
		e1.setName("SaiKrishna");
		e1.setSal(1000000);
		
		Address add = new Address();
		add.setCity("Vijayawada");
		
		e1.setAddress(add);
		
		ses.save(e1);
		tx.commit();
	}
}
