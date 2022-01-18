package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.EmpTable;

public class EmpHiberMethods {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
//		EmpTable e2 =(EmpTable) ses.load(EmpTable.class, 2);
		EmpTable e1 = new EmpTable();
		e1.setName("sai");
		e1.setSal(32222);
		ses.save(e1);
		tx.commit();
	}
}
