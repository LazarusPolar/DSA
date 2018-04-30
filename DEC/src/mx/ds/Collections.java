package mx.ds;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		
		// ArrayList en Java 
		// For reading data. (Access)
		// Not recommended por adding and delete 
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Hola");
		ar.add("Saludos");
		
		ar.get(0);
		ar.remove(0);
		
		for (String string : ar) {
			System.out.println("Valores: " + string);
		}
		
		ArrayList<Employee> emp = new ArrayList<>();
		Employee empl = new Employee("Jose", 11);
		emp.add(empl);
		emp.add(new Employee("Roberto", 111));
		
		for (Employee employee : emp) {
			System.out.println("Empleados: " + employee.age);
		}
		
	}
	
	static class Employee {
		String name;
		int age;
		
		public Employee(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

}
