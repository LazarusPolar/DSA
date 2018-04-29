package mx.ds;

import java.util.Arrays;

public class StackDArray<T> {
	Object[] ArrayStack;
	int size;
	int top;
	public StackDArray(int size) {
		this.size = size;
		ArrayStack = new Object[this.size];
		top = -1;
	}
	
	public void push(Object newItem) {
		// Para empujar un valor se asegura que la capacidad del arreglo dinamico
		// Sea la indicada para meter un valor nuevo
		// Se realiza un top + 2 por que, el valor inicial del top es -1
		aseguraCapacidad(top+2);
		// Comprobando que no este llena, se aumenta el top y se agrega el nuevo elemento a la pila
		top = top + 1;
		ArrayStack[top] = newItem;
	}
	
	public void aseguraCapacidad(int capacidadMinima) {
		int antiguaCapacidad = getTamanio();
		if(capacidadMinima > antiguaCapacidad) {
			int nuevaCapacidad = antiguaCapacidad * 2;
			if(nuevaCapacidad < capacidadMinima) {
				nuevaCapacidad = capacidadMinima;
			}
			ArrayStack = Arrays.copyOf(ArrayStack, nuevaCapacidad);
		}
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
	
	public int getTamanio() {
		return ArrayStack.length;
	}
}
