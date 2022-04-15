package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	List<Integer> numeros = new ArrayList<Integer>();
	
	private List<Integer> getNumeros() {
		return numeros;
	}

	public Multioperador addNumer(int i) {
		this.getNumeros().add(i);
		return this;
	}

	public int sumar() {
		int suma = 0;
		for (int entero:numeros) {
			suma += entero;
		}
		return suma;
	}

	public int restar() {
		int resta = 0;
		for (int entero:numeros) {
			resta -= entero;
		}
		return resta;
	}
	
	public int multiplicar() {
		int mult = 1;
		for (int entero:numeros) {
			mult = mult * entero;
		}
		return mult;
	}
}
