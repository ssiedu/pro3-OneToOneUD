package com.ssi;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	public Laptop(String laptopCode) {
		super();
		this.laptopCode = laptopCode;
	}
	
}
