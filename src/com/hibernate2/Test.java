package com.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.seteName("pravin1");
	    emp.setcName("cdac");
		
		try {
		Configuration conf = new Configuration();
		conf.configure("com/hibernate2/xml/hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(emp);
		tr.commit();
		 
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}

}
