package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Department dept = new Department();
		
		System.out.print("Nome do departamento: ");
		String departmenteName = sc.nextLine(); 
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		
		
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address address = new Address(email, phone);
		dept = new Department(departmenteName, payDay, address);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			System.out.printf("Dados do funcionário %d: %n", i);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(name, salary);
			dept.addEmployee(employee);
		}
		
		System.out.println();
		showReport(dept);
		
		
		sc.close();

		
	}

	private static void showReport(Department dept) {
		
	System.out.println(dept);
	
	
	
	}
	
	
	
}
