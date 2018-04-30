package mx.ds;

public class HW1 {
	public static void main(String[] args) {
		int mayorValor = 0;
		
		DemoLinkedList<Integer> dll1 = new DemoLinkedList<>();
		dll1.add(1);
		dll1.add(5);
		dll1.add(10);
		dll1.add(15);
		dll1.add(20);

		/*
		DemoLinkedList<Integer> dll2 = new DemoLinkedList<>();
		dll1.add(5);
		dll1.add(11);
		dll1.add(12);
		dll1.add(13);
		dll1.add(14);
		*/
		
		StackLinkedList<Integer> sll = new StackLinkedList<>();		
		sll.push(5);
		sll.push(11);
		sll.push(12);
		sll.push(13);
		sll.push(14);
		
		dll1.display();
		sll.display();
	}
}
