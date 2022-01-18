package com.ex.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import com.ex.entity.EmpTable;

public class EmpCriteria {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		Criteria crit = ses.createCriteria(EmpTable.class);
//		crit.add(Restrictions.gt("sal", 100));
		crit.add(Projections.property("id"));
		List<EmpTable> list = crit.list();
		System.out.println(list);
		ses.save(list);
		tx.commit();
	}
}
