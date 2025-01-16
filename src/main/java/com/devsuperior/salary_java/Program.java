package com.devsuperior.salary_java;

import java.util.Scanner;

import com.devsuperior.salary_java.service.PensionService;
import com.devsuperior.salary_java.service.SalaryService;
import com.devsuperior.salary_java.service.TaxService;
import com.devsuperior.salary_java.service.BrazilTaxService;
import entities.Employee;

//import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Passo 1. Verificar se esta funcionado corretamente
		TaxService taxservice = new TaxService(); 
		System.out.println(taxservice.tax(4000.00));
		
		PensionService pensionService = new PensionService();
		System.out.println(pensionService.discount(4000.00));
		*/
		
		/* Passo 0
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome :  ");
		String name = sc.nextLine();
		
		System.out.print("Salario Bruto :  ");
		double grossSalary = sc.nextDouble();
		
		double netSalary = grossSalary * 0.7;
		System.out.printf("Salario Liquido = %.2f%n ",netSalary);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome :  ");
		String name = sc.nextLine();
		
		System.out.print("Salario Bruto :  ");
		double grossSalary = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary);
		
		// TaxService taxService = new TaxService();
		TaxService taxService = new BrazilTaxService();
		PensionService pensionService = new PensionService();
		SalaryService salaryService = new SalaryService(taxService, pensionService);
		
		double netSalary = salaryService.netsalary(employee);
		System.out.printf("Salario Liquido = %.2f%n ",netSalary);
		
		sc.close();
		
		
	}

}
