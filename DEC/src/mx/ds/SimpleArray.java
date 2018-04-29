package mx.ds;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numeros = new int[5];
		numeros[0] = 20;
		numeros[1] = 5;
		numeros[2] = 15;
		numeros[3] = 30;
		numeros[4] = 12;
		//System.out.print("Numero 3: " + numeros[2]);
		System.out.println("Tamaño del arreglo: "+ numeros.length);
		for(int contador = 0; contador <= numeros.length - 1; contador++) {
			System.out.println("Numero " + contador + ": " + "Valor: " + numeros[contador]);
		}
		
		Estudiante[] estudiantes = new Estudiante[4];
		estudiantes[0] = new Estudiante("Jose", 12);
		estudiantes[1] = new Estudiante("Jose1", 121);
		estudiantes[2] = new Estudiante("Jose2", 122);
		estudiantes[3] = new Estudiante("Jose3", 123);
		for (Estudiante estudiante : estudiantes) {
			System.out.println( "Valor: " + estudiante.nombre + " " + estudiante.edad);
		}
		
	}

}
