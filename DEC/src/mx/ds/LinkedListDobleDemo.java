package mx.ds;

public class LinkedListDobleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DobleLinkedList<String> ls = new DobleLinkedList<String>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.display();
		ls.delete();
		ls.display();
	}

}
