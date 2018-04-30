package mx.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

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
		
		// Linked List 
		// Need to read/write data
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Jose");
		ls.add("Roberto");
		ls.add("Almaraz");
				
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println("Valores siguientes: " + itr.next());
		}
		
		// HashMap 
		HashMap<Integer, Employee> mapp = new HashMap<>();
		mapp.put(1, new Employee("Jose", 11));
		mapp.put(2, new Employee("Jose", 11));
		mapp.put(3, new Employee("Jose", 11));
		
		System.out.println("Valor 0: " + mapp.get(1).name);
		
		for(Map.Entry m: mapp.entrySet()) {
			System.out.println("Imprime datos: "+ ((Employee)m.getValue()).name);
		}
		
		//Treeset/Hashset
		//HashSet. Conjunto que no permite y no imprime valores repetidos
		//como,por ejemplo, tener dos cadenas con el nombre "hola"
		//HashSet<String> hs = new HashSet<>();
		
		// TreeSet. Realiza la misma funcion que HashSet con la diferencia de 
		// que este realiza el ordenamiento de los valores ingresados dentro 
		// de la estructura de datos. 
		TreeSet<String> hs = new TreeSet<>();
		hs.add("Hola");
		hs.add("Alo");
		hs.add("Alo");
		hs.add("Javier");
		
		Iterator<String> itrs = hs.iterator();
		while(itrs.hasNext()) {
			System.out.println("Salida Arbol: " + itrs.next());
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
