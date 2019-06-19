package com.csc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.csc.domain.EmpDetails;

public class PersistTest {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		EmpDetails details = null;
		Transaction tx = null;

		// activates hibernate framework
		cfg = new Configuration();

		// load both configuration files;
		cfg = cfg.configure("com/csc/cfgs/hibernate.cfg.xml");

		// build session factory
		factory = cfg.buildSessionFactory();

		// create session
		ses = factory.openSession();

		details = new EmpDetails();
		details.setFname("Pratik");
		details.setLname("Rohokale");
		details.setMail("prohokale01@gmail.com");
		details.setNo(112);

		// use transaction
		try {
			tx = ses.beginTransaction();
			ses.persist(details);
			tx.commit();
			System.out.println("Object saved (insert record)");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Object not saved (record not inserted)");
			e.printStackTrace();
		}

	}
}
