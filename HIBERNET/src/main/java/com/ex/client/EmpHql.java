package com.ex.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.EmpTable;

public class EmpHql {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Query q = ses.createQuery("select e.id from EmpTable e where sal>100");
		List<EmpTable> list = q.list();
		System.out.println(list);
		ses.save(list);
		tx.commit();
	}
}
