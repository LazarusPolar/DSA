package mx.ds;

public class DobleLinkedList<T> {
	DobleNodo head; 
	
	public DobleLinkedList() {
		head = null;
	}
	
	public void add(Object value) {
		DobleNodo nuevoNodo = new DobleNodo(value, null, null);
		if(head == null) {
			head = nuevoNodo;
		} else {
			// head -> La cabeza de la lista. Imaginada mejor como una cola.
			// Nuevo Nodo Next (Nodo) se iguala a la cabeza indicando que, la cabeza antigua, sera corrida en la lista
			nuevoNodo.next = head;
			// Head Previous (Nodo) se iguala a nuevo nodo indicando el previous de la cabeza anterior
			head.previous = nuevoNodo;
			// La cabeza ahora sera igual al nuevo nodo por que fue el ultimo elemento agregado
			head = nuevoNodo;
		}
	}
	
	public void delete() {
		// La cabeza ahora es la siguiente en la lista
		head = head.next;
		// La cabeza ahora tiene un null por que no hay ningun elemento antes de la misma
		head.previous = null;
	}
	
	public void display() {
		DobleNodo n = head; 
		while(n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}
}
