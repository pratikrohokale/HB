package com.csc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csc.domain.InsurancePolicyImpl;

public class LoadOperationTest {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		InsurancePolicyImpl policy = null;

		cfg = new Configuration();
		cfg = cfg.configure("/com/csc/cfgs/hibernate.cfg.xml");
		factory = cfg.buildSessionFactory();
		ses = factory.openSession();

		// load object
		try {
			policy = ses.load(InsurancePolicyImpl.class, 111);
			System.out.println(policy);
		} catch (Exception e) {
			System.out.println("Record not found");
		}
		ses.close();
		factory.close();
	}
}
