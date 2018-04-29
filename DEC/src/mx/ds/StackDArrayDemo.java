package mx.ds;

public class StackDArrayDemo {

	public static void main(String[] args) {
		StackDArray<Integer> st = new StackDArray<>(2);
		st.push(12);
		st.push(14);
		st.push(15);
		st.push(16);
		st.push(16);
		st.push(16);
		st.push(16);
		st.push(16);
		st.push(16);

		System.out.println(st.getTamanio());

		while(!st.isEmpty()) {
			System.out.println("Imprime valor: " + st.pop());
		}
	}

}
