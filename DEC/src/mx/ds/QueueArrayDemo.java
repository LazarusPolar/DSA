package mx.ds;

public class QueueArrayDemo {

	public static void main(String[] args) {
		QueueArray<Integer> queue = new QueueArray<>(5);
		queue.Queue(5);
		queue.Queue(6);
		queue.Queue(7);
		queue.Queue(8);
		queue.Queue(9);
		
		System.out.println("Valores: " + queue.Dequeue());
		
		while(!queue.isEmpty()) {
			System.out.println("Valores: " + queue.Dequeue());
		}
		
		queue.Queue(12);
		queue.Queue(12);

		System.out.println("Valores: " + queue.Dequeue());
		System.out.println("Valores: " + queue.Dequeue());
		System.out.println("Valores: " + queue.Dequeue());
	}

}
