package mx.ds;

public class ArregloDosDimensiones {

	public static void main(String[] args) {
		// Array 3 x 3
		int[][] datos = new int[3][3];
		
		datos[0][0] = 1;
		datos[1][0] = 2;
		datos[2][0] = 3;
		datos[0][1] = 4;
		datos[1][1] = 5;
		datos[2][1] = 6;
		datos[0][2] = 7;
		datos[1][2] = 8;
		datos[2][2] = 9;
		
		for(int contador = 0; contador <= 2; contador++) {
			for(int contador1 = 0; contador1 <= 2; contador1++) {
				// Diagonal de matriz
				if(contador == contador1) {
					System.out.println("Valor: " + datos[contador][contador1]);
				}
			}
		}
	}

}
