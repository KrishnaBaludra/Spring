package com.ex.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ex.entity.ConWorker;
import com.ex.entity.RegularWorker;
import com.ex.entity.Worker;

public class WorkerClient {
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		
		Worker w = new Worker();
		w.setName("Siva");
		
		RegularWorker r = new RegularWorker();
		r.setName("Nandi");
		r.setBonus(555);
		r.setSalary(10000000);
		
		ConWorker c = new ConWorker();
		c.setName("Sankar");
		c.setPayperhour(5555);
		c.setConDuration("5 Hours");
		
		ses.persist(w);
		ses.persist(w);
		ses.persist(w);
		ses.close();
		tx.commit();
		
	}
}
