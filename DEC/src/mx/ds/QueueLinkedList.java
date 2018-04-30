package mx.ds;

import java.awt.RadialGradientPaint;

public class QueueLinkedList<T> {
	DobleNodo Rear; 
	DobleNodo Front; 
	
	public QueueLinkedList() {
		Rear = null;
		Front = null;
	}
	
	public void Queue(Object value) {
		DobleNodo nuevoNodo = new DobleNodo(value, null, null);
		if(Rear == null) {
			Rear = nuevoNodo;
			Front = nuevoNodo;
		} else {
			nuevoNodo.next = null;
			nuevoNodo.previous = Rear;
			Rear.next = nuevoNodo;
			Rear = nuevoNodo;
		}
	}
	
	public T Dequeue() {
		if(Rear ==  null || Front == null) {
			System.out.println("Queue is empty");
			return null;
		}
		
		T value = (T) Front.value;
		Front = Front.next;
		if(Front != null) 
		Front.previous = null;
		return value;
	}
	
}
