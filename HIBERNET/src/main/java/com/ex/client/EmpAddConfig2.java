package com.ex.client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.Address;
import com.ex.entity.EmpAdd2;

public class EmpAddConfig2 {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		EmpAdd2 e1 = new EmpAdd2();
		e1.setName("SaiKrishna");
		e1.setSal(1000000);
		
		Address add = new Address();
		add.setCity("Vijayawada");
		Address add2 = new Address();
		add2.setCity("Hyderabad");
		
		List <Address> addlist = new ArrayList<>();
		addlist.add(add);
		addlist.add(add2);
		
		e1.setAddresslist(addlist);
		ses.save(e1);
		tx.commit();
	}
}
