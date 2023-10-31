package com.deeptech.hibernate.wrok;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.wrok.dto.Student;
import com.deeptech.hibernate.wrok.utility.HibernateUtil;

public class UpdateStudent 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		Student s= ses.get(Student.class, 1);
		s.setSudentName("DhanushArjunan");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
		System.out.println("update success");

	}

}
