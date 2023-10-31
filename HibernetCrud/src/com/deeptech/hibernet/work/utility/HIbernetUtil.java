package com.deeptech.hibernet.work.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernetUtil {
private static SessionFactory sessionfactory;

	static
	{
		sessionfactory=new Configuration().configure().buildSessionFactory();
		
	}
	public static SessionFactory connection()
	{
		return sessionfactory;
		
		
	}
}
