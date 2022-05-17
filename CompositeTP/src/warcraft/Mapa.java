package warcraft;

import java.util.ArrayList;

public class Mapa {

	ArrayList<Punto> lajas;
	
	public Mapa() {
		lajas = new ArrayList<Punto>();
	}
	
	public Punto irEnDiagonalADesde(Punto pFinal, Punto pActual) {
		int x = pActual.getX();
		int y = pActual.getY();
		int xf = pFinal.getX();
		int yf = pFinal.getY();
		
		if (x < xf) {
			x ++;
		}
		if (x > xf) {
			x --;
		}
		if (y < yf) {
			y ++;
		}
		if (y > yf) {
			y --;
		}
		return new Punto(x,y);
	}

	public boolean ponerLaja(Punto p) {
		if (lajas.contains(p)) {
			return false;
		}
		lajas.add(p);
		return true;
	}

}