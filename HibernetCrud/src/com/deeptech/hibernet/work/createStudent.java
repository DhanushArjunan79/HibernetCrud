package com.deeptech.hibernet.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernet.work.dto.Student;
import com.deeptech.hibernet.work.utility.HIbernetUtil;

public class createStudent {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setStudentname("Pavithraaa");
		s.setRollno(79);
		s.setCourse("bca");
		SessionFactory sf=HIbernetUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		ses.save(s);
		System.out.println("Table created Success and Record is inserted");
		ses.close();
		sf.close();
		
			}

}
