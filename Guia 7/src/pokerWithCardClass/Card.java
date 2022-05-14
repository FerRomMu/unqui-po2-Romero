package pokerWithCardClass;


public class Card {

	Character valor, palo;
	
	/**
	 * Retorna una carta cuya representacion se obtiene en base
	 * a los dos caracteres del string dado. El primero representa
	 * su valor A para el As, 2 al 9 para los numeros, 0 para 10 
	 * y J,Q y K para las letras.
	 * Precondicion: El String tiene valores validos.
	 * @param s un String de dos caracteres que representa el valor
	 * y el palo. A para As, 2 al 9 para esos valores, J,Q y K para
	 * letras, 0 para el 10. Los palos se representan con D,T,P y C.
	 */
	public Card(String s) {
		valor = s.charAt(0);
		palo = s.charAt(1);
	}

	/**
	 * Retorna el valor que representa la carta.
	 * @return
	 */
	public Character getValor() {
		return valor;
	}

	/**
	 * Retorna el palo que representa la carta-
	 * @return
	 */
	public Character getPalo() {
		return palo;
	}

	/**
	 * Compara dos valores de cartas.
	 * @param c2
	 * @return
	 */
	public boolean esMayorA(Card c2) {
		return this.valueToInt() > c2.valueToInt();
	}

	public int valueToInt() {
		int n=0;
		if(Character.isDigit(valor)) {
			n = Character.digit(valor, 10);
			if (n == 0) {
				n = 10;
			}
		}else {
			switch(valor){
				case 'A': n = 14;
				case 'K': n = 13;
				case 'Q': n = 12;
				case 'J': n = 11;
			}
		}
		return n;
	}

}
