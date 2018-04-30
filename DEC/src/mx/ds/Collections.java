package mx.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
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
		// In most cases, the worst list structure choice 
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Jose");
		ls.add("Roberto");
		ls.add("Almaraz");
				
		Iterator<String> itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println("Valores siguientes: " + itr.next());
		}
		
		// HashMap 
		// Estructura en donde los valores son recuperados con una llave 
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
		
		// Stack
		// Ejemplo sencillo de pila creado en Java
		Stack<String> st = new Stack<>();
		st.push("Hola");
		System.out.println("Valor: " + st.pop());
		st.push("Hola");
		System.out.println("Valor: " + st.pop());
		
		//Queue & Priority Queue
		// Ejemplo basico de Cola
		// Sigue el ejemplo de "Primero que entra, primero que sale"
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q.poll());
		
		// Ejemplo de Priority Queue
		// Ordena los elementos agregados en la cola 
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(15);
		pq.add(14);
		pq.add(20);
		pq.add(2);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		PriorityQueue<Student> pqs = new PriorityQueue<>();
		pqs.add(new Student("Jose", 10));
		pqs.add(new Student("Roberto", 1));
		pqs.add(new Student("Jose", 2));
		pqs.add(new Student("Almaraz", 11));
		System.out.println("Valor de PQ EST: " + (pqs.poll()).age);
		//System.out.println("Valor de PQ EST: " + (pqs.poll()).age);
		//System.out.println("Valor de PQ EST: " + (pqs.poll()).age);
		//System.out.println("Valor de PQ EST: " + (pqs.poll()).age);

	
		// Sort Array of Objects
		// Se usa comparable para la comparacion y sorting customizado
		// de un ArrayList de Objetos 
		ArrayList<Person> listOfNames = new ArrayList<>();
		listOfNames.add(new Person("Jose", 15));
		listOfNames.add(new Person("Jose1", 12));
		listOfNames.add(new Person("Jose2", 13));
		listOfNames.add(new Person("Jose3", 14));

		for (Person string : listOfNames) {
			System.out.println("Valores de lista sin ordenar: " + string.name);
		}
		
		// Collections.sort - Ordena matematicamente los elementos de un arreglo
		java.util.Collections.sort(listOfNames);
		for (Person string : listOfNames) {
			System.out.println("Valores de lista ordenados: " + string.age);
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
	
		static class Person implements Comparable<Person> {
		String name;
		int age;
		public Person (String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public int compareTo(Person o) {
			System.out.println("Resta" + " " + (this.age - o.age));
			return this.age - o.age;
		}
	}
	
	static class Student implements Comparable<Student> {
		String name;
		int age;
		
		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
			
		// Definicion de comparacion de objeto para ordenar el
		// Priority Queue
		@Override
		public int compareTo(Student o) {
			if(this.age == o.age) {
				System.out.println("Retorna 0");
				return 0;
			} else if (this.age > o.age) {
				System.out.println("Retorna 1 " + o.age + " " + this.age);
				return 1;
				}
				else {
					System.out.println("Retorna -1 " + o.age + " " + this.age);
					return -1;
					}
		}
	}
	
	
}
