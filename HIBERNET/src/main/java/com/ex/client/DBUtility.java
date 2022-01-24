package com.ex.client;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtility {

	private static SessionFactory sf = null;

	public static SessionFactory getSF() {
		if (sf == null) {
			synchronized (DBUtility.class) {
				if (sf == null) {
					sf = new Configuration().configure().buildSessionFactory();
				}
			}
		}
		return sf;
	}
}
