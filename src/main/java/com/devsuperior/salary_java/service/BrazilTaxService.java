package com.devsuperior.salary_java.service;

public class BrazilTaxService extends TaxService {

	@Override
	public double tax (double amount) {
		return amount * 0.3;
	}
	
}
