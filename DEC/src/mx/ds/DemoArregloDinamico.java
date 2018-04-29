package mx.ds;

public class DemoArregloDinamico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArregloDinamico<Integer> da = new ArregloDinamico<>();
		da.put(10);
		da.put(100);
		da.put(10000);
		da.put(10000);
		da.put(10000);

		System.out.println("Imprime tamaño: " + da.getTamanio());
		
		for(int i = 0; i <= da.getTamanio()-1; i++) {
			System.out.println("Imprime valor: " + da.get(i));
		}
	}

}
