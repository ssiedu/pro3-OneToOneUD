package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddEmps {
	public static void main(String[] args) {

		Session session=Data.getSF().openSession();
		Transaction tr=session.beginTransaction();
		Emp e1=new Emp(); 
		e1.setEcode("E111"); e1.setEname("AAA"); e1.setSal(10000);
		e1.setLaptop(new Laptop("L111"));
		Emp e2=new Emp("E112","BBB",20000,new Laptop("L112"));
		Emp e3=new Emp("E113","CCC",30000,new Laptop("L113"));
		session.save(e1); session.save(e2); session.save(e3);
		tr.commit();
		System.out.println("Emps Data Stored");
		

	}
}
