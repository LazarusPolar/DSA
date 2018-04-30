package mx.ds;

public class QueueDArrayDemo {

	public static void main(String[] args) {
		QueueDArray<Integer> q = new QueueDArray<>(2);
		q.Queue(11);
		q.Queue(12);
		System.out.println("Tamaño: " + q.getTamanio());
		q.Queue(12);
		System.out.println("Tamaño: " + q.getTamanio());
		
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());

		q.Queue(12);
		System.out.println("Imprime valor: " + q.Dequeue());
		q.Queue(12);
		q.Queue(12);
		q.Queue(12);
		q.Queue(12);

		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());

		q.Queue(12);
		q.Queue(12);
		q.Queue(12);
		q.Queue(12);

		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());
		System.out.println("Imprime valor: " + q.Dequeue());

	}

}
