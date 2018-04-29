package mx.ds;

public class DemoLinkedList<T> {
	Nodo head; 
	
	public DemoLinkedList() {
		head = null;
	}
	
	public void add(Object value) {
		Nodo nuevoNodo = new Nodo(value, null);
		if(head == null) {
			head = nuevoNodo;
		} else {
			nuevoNodo.next = head;
			head = nuevoNodo;
		}
	}
	
	public void delete() {
		head = head.next;
	}
	
	public void display() {
		Nodo n = head; 
		while(n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}
}
