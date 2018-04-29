package mx.ds;
public class StackArray<T> {
	Object[] ArrayStack;
	int size;
	int top;
	public StackArray(int size) {
		this.size = size;
		ArrayStack = new Object[this.size];
		top = -1;
	}
	
	public void push(Object newItem) {
		// Para empujar un valor a la pila, se revisa que no este llena 
		if(isFull()) {
			System.out.println("Pila llena");
			return;
		}
		// Comprobando que no este llena, se aumenta el top y se agrega el nuevo elemento a la pila
		top = top + 1;
		ArrayStack[top] = newItem;
	}
	
	public T pop() {
		// Para remover un elemento, se revisa que la pila no este vacia 
		if(isEmpty()) {
			System.out.println("Pila vacia");
			return null;
		}
		// Si la pila no esta vacia, se remuee el objeto, se devuelve dicho valor y se reduce el top 
		T item = (T) ArrayStack[top];
		top = top - 1;
		return item;
	}
	
	// Revisa si la pila esta llena
	public Boolean isFull() {
		return (top == size - 1);
	}
	
	// Revisa si la pila esta vacia 
	public Boolean isEmpty() {
		return (top == -1);
	}
}
