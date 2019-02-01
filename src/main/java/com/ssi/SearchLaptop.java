package com.ssi;

import java.util.Scanner;

import org.hibernate.Session;

public class SearchLaptop {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Laptop Code : ");
		String code=sc.next();
		Session session=Data.getSF().openSession();
		
		Laptop laptop=session.get(Laptop.class, code);
		
		System.out.println(laptop.getLaptopCode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		//System.out.println(laptop.getEmp());
		session.close();

	}

}
