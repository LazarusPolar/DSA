package mx.ds;

import java.util.Arrays;

public class ArregloDinamico<T> {
	
	Object[] datos; 
	int tamanio;
	
	public ArregloDinamico() {
		tamanio = 0;
		datos = new Object[1];
	}
	
	public int getTamanio() {
		return datos.length;
	}
	
	public T get(int index) {
		return (T) datos[index];
	}
	
	public void put(Object elemento) {
		aseguraCapacidad(tamanio+1);
		datos[tamanio++] = elemento;
	}
	
	public void aseguraCapacidad(int capacidadMinima) {
		int antiguaCapacidad = getTamanio();
		if(capacidadMinima > antiguaCapacidad) {
			int nuevaCapacidad = antiguaCapacidad * 2;
			if(nuevaCapacidad < capacidadMinima) {
				nuevaCapacidad = capacidadMinima;
			}
			datos = Arrays.copyOf(datos, nuevaCapacidad);
		}
	}
}
