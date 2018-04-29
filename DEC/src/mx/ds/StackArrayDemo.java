package mx.ds;

public class StackArrayDemo {

	public static void main(String[] args) {
		StackArray<Integer> st = new StackArray<>(5);
		st.push(12);
		st.push(13);
		st.push(14);
		st.push(15);
		st.push(16);
		
		while(!st.isEmpty()) {
			System.out.println("Pila: " +st.pop());
		}

	}

}
