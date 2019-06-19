package com.csc.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csc.domain.InsurancePolicyImpl;

public class GetOperationTest {
	public static void main(String[] args) {
		Configuration cfg = null;
		SessionFactory factory = null;
		Session ses = null;
		InsurancePolicyImpl ins = null;

		// activates hibernate (bootstraps hibernate)
		cfg = new Configuration();

		// load both config files
		cfg = cfg.configure("/com/csc/cfgs/hibernate.cfg.xml");

		// create sessionFactory
		factory = cfg.buildSessionFactory();
		// create session
		ses = factory.openSession();

		ins = ses.get(InsurancePolicyImpl.class, 111);
		if (ins != null) {
			System.out.println("" + ins);
		} else {
			System.out.println("Object not found");
		}
		ses.close();
		factory.close();

	}
}
