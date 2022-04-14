package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
	List<Integer> numeros = new ArrayList<Integer>();
	
	//Ejercicio 1
	public int cantPares() {
		int c=0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 == 0) {
				c++;
			}
		}
		return c;
	}
	
	public int cantImpares() {
		int c=0;
		for (Integer numero : this.getNumeros()) {
			if (numero % 2 == 1) {
				c++;
			}
		}
		return c;
	}

	public int cantMultiplos(int x) {
		int c=0;
		for (Integer numero : this.getNumeros()) {
			if (numero % x == 0) {
				c++;
			}
		}
		return c;
	}
	
	//Ejercicio 2
	private List<Integer> getNumeros() {
		return numeros;
	}

	public Counter addNumer(int i) {
		this.getNumeros().add(i);
		return this;
	}

	public int numeroConMasPares() {
		Integer elMasPares = null;
		int aux=0;
		for (int n : this.getNumeros()) {
			if (elMasPares == null || this.cantidadParesDesarmado(n) > aux) {
				elMasPares = n;
				aux = this.cantidadParesDesarmado(n);
			}
		}
		return elMasPares;
	}

	private int cantidadParesDesarmado(int x) {
		int cantPares = 0;
		while(x>0) {
			int digito = x % 10;
			if (digito % 2 == 0) cantPares ++;
			x=x/10;
		}
		return cantPares;
	}
	
	//Ejercicio 3
	public int multiplos(int x, int y) {
		int r = -1;
		for(int i=1000; i>0; i--) {
			if(i%x == 0 && i%y==0) {
				r = i;
				break;
			}
		}
		return r;
	}
}
