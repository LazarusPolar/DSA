package mx.ds;

public class LinkedListImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoLinkedList<String> ls = new DemoLinkedList<String>();
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
