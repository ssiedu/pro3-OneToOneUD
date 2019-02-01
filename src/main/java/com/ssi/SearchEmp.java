package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;

public class SearchEmp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ECode : ");
		String code=sc.next();
		Session session=Data.getSF().openSession();
		Emp emp=session.get(Emp.class, code);
		System.out.println(emp.getEcode());
		System.out.println(emp.getEname());
		System.out.println(emp.getSal());
		//System.out.println(emp.getLaptop().getBrand());
		//System.out.println(emp.getLaptop().getPrice());
		
		

	}

}
