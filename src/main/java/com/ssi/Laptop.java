package com.ssi;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Laptop {
	@Id
	private String laptopCode;
	private String brand;
	private int price;
	@OneToOne(mappedBy="laptop", fetch=FetchType.LAZY)
	private Emp emp;
	
	
	public Laptop(String laptopCode) {
		super();
		this.laptopCode = laptopCode;
	}

	public Laptop(String laptopCode, String brand, int price) {
		super();
		this.laptopCode = laptopCode;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [laptopCode=" + laptopCode + ", brand=" + brand
				+ ", price=" + price + "]";
	}

	
	





}
