package mx.ds;

public class QueueDDemo {

	public static void main(String[] args) {
		QueueLinkedList<Integer> q = new QueueLinkedList<>();
		q.Queue(12);
		q.Queue(13);
		q.Queue(14);
		q.Queue(15);
		q.Queue(16);

		System.out.println("Valor: " + q.Dequeue());
		System.out.println("Valor: " + q.Dequeue());
		System.out.println("Valor: " + q.Dequeue());
		System.out.println("Valor: " + q.Dequeue());

		q.Queue(19);
		q.Queue(20);
		q.Queue(21);
		q.Queue(22);
		q.Queue(23);
		
		System.out.println("Valor: " + q.Dequeue());
		System.out.println("Valor: " + q.Dequeue());
		System.out.println("Valor: " + q.Dequeue());
		System.out.println("Valor: " + q.Dequeue());
		System.out.println("Valor: " + q.Dequeue());

	}

}
