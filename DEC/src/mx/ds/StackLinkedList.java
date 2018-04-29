package mx.ds;

public class StackLinkedList<T> {
	Nodo top; 
	
	public StackLinkedList() {
		top = null;
	}
	
	public void push(Object value) {
		Nodo nuevoNodo = new Nodo(value, null);
		if(top == null) {
			top = nuevoNodo;
		} else {
			nuevoNodo.next = top;
			top = nuevoNodo;
		}
	}
	
	public T pop() {
		if(top == null) {
			System.out.println("Pila vacia");
			return null;
		}
		T value =(T) top.value;
		top = top.next;
		return value;
	}
	
	public void display() {
		Nodo n = top; 
		while(n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}
}
