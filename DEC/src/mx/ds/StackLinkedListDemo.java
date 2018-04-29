package mx.ds;

public class StackLinkedListDemo {

	public static void main(String[] args) {
		StackLinkedList<Integer> sll = new StackLinkedList<>();
		sll.pop();
		sll.push(12);
		sll.push(13);
		sll.push(14);
		sll.push(15);
		
		sll.display();

	}

}
