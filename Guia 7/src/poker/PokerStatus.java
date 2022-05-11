package poker;

import java.util.HashMap;
import java.util.Iterator;

public class PokerStatus {

	HashMap<Character,Integer> m;
	
	public PokerStatus() {
		m = new HashMap<Character,Integer>();
	}
	
	/**
	 * Verifica que las cartas dadas tengan poker.
	 * @param c1 las cartas dadas con formato ValorPalo "8P"
	 * @param c2
	 * @param c3
	 * @param c4
	 * @param c5
	 * @return verdero si es poker.
	 */
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {

		String hv = this.getHandValues(c1,c2,c3,c4,c5);
		return this.isPoker(hv);
		
	}

	/**
	 * Verifica si hay al menos 4 valores dados que sean iguales.
	 * @param hv un String de 5 caracteres con los valores numericos de cada carta.
	 * @return verdadero si hay 4 valores iguales.
	 */
	private boolean isPoker(String hv) {
		this.clearMSet();
		for(int i=0; i < hv.length();i++) {
			this.addMSet(hv.charAt(i));
		}
		return this.hayPokerEnMSet(); 
	}

	/**
	 * Recorre el multiset dado para ver si hay al menos un elemento con
	 * 4 instancias de él (por ej 4 letras k).
	 * Precondición: El multiSet m tiene los valores de cada carta.
	 * @return verdadero si los valores del multiset dan poker.
	 */
	private boolean hayPokerEnMSet() {
		Iterator<Character> i = m.keySet().iterator();
		while(i.hasNext()) {
			Character c = i.next();
			if(m.get(c) >= 4) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Agrega un caracter que corresponde al valor de una carta.
	 * @param s el caracter a agregar.
	 */
	private void addMSet(Character s) {
		
		m.put(s, m.getOrDefault(s, 0) + 1);
		
	}

	/**
	 * Borra todo posible valor del multiset m.
	 */
	private void clearMSet() {
		
		m.clear();
	}

	/**
	 * Dadas 5 cartas, obtiene el valor númerico de cada una y lo devuelve
	 * como un String de 5 caracteres.
	 * @param c1 Las cartas.
	 * @param c2
	 * @param c3
	 * @param c4
	 * @param c5
	 * @return un String de 5 caracteres con cada valor de cada carta.
	 */
	private String getHandValues(String c1, String c2, String c3, String c4, String c5) {
		return "" + c1.charAt(0) + c2.charAt(0) + c3.charAt(0) + c4.charAt(0) + c5.charAt(0);
	}

}
