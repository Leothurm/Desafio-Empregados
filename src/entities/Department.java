package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	
	private Address address;
	
	private List<Employee> employees = new ArrayList<>();

	public Department() {
		
	}
	
	public Department(String name, int payDay, Address address) {
		super();
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payroll() {
		double sum = 0.0;
		for(Employee employee : employees) {
			sum += employee.getSalary();
		}
		return sum;

	}	
		
		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("FOLHA DE PAGAMENTO: \n");
		sb.append("Departamento Vendas = R$ ");
		sb.append(String.format("%.2f", payroll()));
		sb.append("\n");
		sb.append("Pagamento realizado no dia ");
		sb.append(payDay + "\n");
		sb.append("Funcionários: \n");
		for (Employee employee : employees) {
			sb.append(employee.getName() + "\n");
		}
		sb.append("Para dúvidas favor entrar em contato: ");
		sb.append(address.getEmail());
		
		
		
		
		return sb.toString();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
