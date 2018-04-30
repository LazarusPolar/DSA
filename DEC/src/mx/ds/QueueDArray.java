package mx.ds;

import java.util.Arrays;

public class QueueDArray<T> {
Object[] ArrayQueue;
int Rear;
int Front; 
int size; 

	public QueueDArray(int size) {
		this.size = size;
		ArrayQueue = new Object[this.size];
		Front = -1;
		Rear = -1;
	}
	
	public Boolean isFull() {
		return (Rear == size-1);
	}
	
	public Boolean isEmpty() {
		return (Front == -1 || Front > Rear);
	}
	
	public void Queue(Object newItem) {
		aseguraCapacidad(Rear + 2);
		Rear = Rear + 1;
		ArrayQueue[Rear] = newItem;
		if(Front == -1) {
			Front = 0;
		} 
	}
	
	public void aseguraCapacidad(int capacidadMinima) {
		int antiguaCapacidad = getTamanio();
		if(capacidadMinima > antiguaCapacidad) {
			int nuevaCapacidad = antiguaCapacidad * 2;
			if(nuevaCapacidad < capacidadMinima) {
				nuevaCapacidad = capacidadMinima;
			}
			ArrayQueue = Arrays.copyOf(ArrayQueue, nuevaCapacidad);
		}
	}
	
	public int getTamanio() {
		return ArrayQueue.length;
	}

	public T Dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		T ObjectOut = (T) ArrayQueue[Front];
		Front = Front + 1;
		return ObjectOut;
	}
}
