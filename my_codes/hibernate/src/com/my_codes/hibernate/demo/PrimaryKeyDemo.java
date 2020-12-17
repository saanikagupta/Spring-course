package com.my_codes.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.my_codes.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(Student.class)
				 .buildSessionFactory();
	
		Session session = factory.getCurrentSession();
	
		try {
		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("Saanika", "Gupta", "guptasaanika@gmail.com");
		Student tempStudent2 = new Student("Gazal", "Jain", "gazal17100a@iiitnr.edu.in.com");
		Student tempStudent3 = new Student("Yukta", "Khanna", "yukku@gmail.com");
		
		session.beginTransaction();
		
		session.save(tempStudent1);
		session.save(tempStudent2);
		session.save(tempStudent3);

		session.getTransaction().commit();
		System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}
}
