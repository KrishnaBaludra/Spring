package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.EmpTable;

public class EmpTableConfig {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		EmpTable e1 = new EmpTable();
		e1.setId(1);
		e1.setName("SaiKrishna");
		e1.setSal(3333);
		ses.delete(e1);
		tx.commit();
	}
}
