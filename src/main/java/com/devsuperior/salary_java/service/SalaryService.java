package com.devsuperior.salary_java.service;

import entities.Employee;

public class SalaryService {

	//Forma errada. Como o salarayService depende do taxService e do PensionService, esses não podem
	//ser instaciados dentro desse, o sistema deve ser desacoplado
	//TaxService taxservice = new TaxService();
	//PensionService pensionService = new PensionService();
	
	
	// Vamos injetar as dependencias usando consctrutor
	private TaxService taxService; 
	private PensionService pensionService; 
	
	public SalaryService(TaxService taxService, PensionService pensionService ) {
		this.taxService = taxService;
		this.pensionService = pensionService;
	}
	
	
	public double netsalary(Employee employee) {
		
		return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - 
				pensionService.discount(employee.getGrossSalary());
		
		
	}
	
}
