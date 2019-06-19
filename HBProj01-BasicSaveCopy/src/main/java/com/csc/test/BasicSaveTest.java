package com.csc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.csc.domain.EmpDetails;

public class BasicSaveTest {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		EmpDetails details = null;
		Transaction tx = null;
		int idval = 0;
		
		// activate Hibernate framework(bootstrapping Hibernate)
		cfg = new Configuration();

		// load and read both xml files;
		cfg = cfg.configure("com/csc/cfgs/hibernate.cfg.xml");

		// build sessionFactory;
		factory = cfg.buildSessionFactory();
		// open session
		ses = factory.openSession();

		details = new EmpDetails();
		details.setNo(113);
		details.setFname("Pratik");
		details.setLname("Rohokale");
		details.setMail("pratik.rohokale@gmail.com");

		try {
			tx = ses.beginTransaction();
			idval = (int) ses.save(details);
			tx.commit();
			System.out.println("Generated idval:: " + idval);
			System.out.println("Object saved (insert record)");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("obj not saved(record not inserted)");
			e.printStackTrace();
		}
		ses.close();
		factory.close();

	}
}
