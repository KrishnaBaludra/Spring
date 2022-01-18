package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.EmpTable;

public class Emptable3 {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
//		EmpTable e2 =(EmpTable) ses.load(EmpTable.class, 2);
		EmpTable e1 = new EmpTable();
		e1.setId(4);
		e1.setName("sai krishna");
//		e1.setSal(0);
		ses.update(e1);
		tx.commit();
	}
}