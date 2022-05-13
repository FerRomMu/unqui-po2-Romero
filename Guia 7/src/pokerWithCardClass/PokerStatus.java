package pokerWithCardClass;

import java.util.HashMap;
import java.util.Iterator;

public class PokerStatus {

	HashMap<Character,Integer> m;
	
	public PokerStatus() {
		m = new HashMap<Character,Integer>();
	}
	
	/**
	 * Verifica que las cartas dadas tengan poker, color o trio.
	 * @param c1 las cartas dadas con formato ValorPalo "8P"
	 * @param c2
	 * @param c3
	 * @param c4
	 * @param c5
	 * @return "Poker","Trio","Color" o "Nada" según corresponda.
	 */
	public String verificar(Card c1, Card c2, Card c3, Card c4, Card c5) {

		//Carga el multiset para verificar valores numericos
		this.setM(this.getHand(c1,c2,c3,c4,c5,false));
		if (this.isPoker()) {
			return "Poker";
		}else if (this.isTrio()) {
			return "Trio";
		}
		//Carga el multiset para verificar valores de palo
		this.setM(this.getHand(c1, c2, c3, c4, c5,true));
		if(this.isColor()) {
			return "Color";
		}
		return "Nada";
	}

	/**
	 * Indica si hay poker en la mano.
	 * Precondición: El multiSet m tiene los valores numericos de cada carta.
	 * @return verdadero si los valores del multiset dan poker.
	 */
	private boolean isPoker() {
		return this.hayAlMenos(4);
	}

	/**
	 * Indica si hay trio en la mano.
	 * Precondición: El multiSet m tiene los valores numericos de cada carta.
	 * @return verdadero si los valores del multiset dan trio.
	 */
	private boolean isTrio() {
		return this.hayAlMenos(3);
	}

	/**
	 * Indica si hay color en la mano.
	 * Precondición: El multiSet m tiene los valores de palos de cada carta.
	 * @return verdadero si los valores del multiset dan color.
	 */
	private boolean isColor() {
		return this.hayAlMenos(5);
	}

	/**
	 * Verifica si hay n cantidad de valores repetidos dentro del
	 * multiset.
	 * @param n es la cantidad de valores repetidos que debe haber.
	 * @return Verdadero si hay n valores repetidos.
	 */
	private boolean hayAlMenos(int n) {
		Iterator<Character> i = m.keySet().iterator();
		while(i.hasNext()) {
			Character c = i.next();
			if(m.get(c) >= n) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Carga en el multiset la cadena de caracteres dada.
	 * Cada caracter debe corresponder a un valor de la mano del jugador.
	 * @param hv representa los valores de las cartas de la mano del jugador.
	 */
	private void setM(String hv) {
		this.clearMSet();
		for(int i=0; i < hv.length();i++) {
			this.addMSet(hv.charAt(i));
		}
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
	 * Dadas 5 cartas y un int que vale 0 o 1, obtiene el valor númerico 
	 * de cada una si es 0 el int dado o el color de cada una y lo devuelve
	 * como un String de 5 caracteres.
	 * Precondicion: i es 0 o 1.
	 * @param c1 Las cartas.
	 * @param c2
	 * @param c3
	 * @param c4
	 * @param c5
	 * @param i es el indice del caracter a buscar en la carta.
	 * @return un String de 5 caracteres con cada valor pedido de las cartas.
	 */
	private String getHand(Card c1, Card c2, Card c3, Card c4, Card c5, boolean b) {
		if(b) {
			return "" + c1.getPalo() + c2.getPalo() + c3.getPalo() + c4.getPalo() + c5.getPalo();
		}
		return "" + c1.getValor() + c2.getValor() + c3.getValor() + c4.getValor() + c5.getValor();
	}

}
