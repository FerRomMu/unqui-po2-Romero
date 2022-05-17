package warcraft;

public class Ingeniero extends Caracter{

	int lajas;
	Punto posicion;
	Mapa mundo;
	
	public Ingeniero(int l, Punto p, Mapa m) {
		lajas = l;
		posicion = p;
		mundo = m;
	}
	
	@Override
	public void caminar(Punto p) {
		while(p.equals(posicion)) {
			posicion = mundo.irEnDiagonalADesde(p, posicion);
			if(this.tengoLajas()) {
				lajas -= mundo.ponerLaja(posicion) ? 1 : 0;
			}
		}
	}

	private boolean tengoLajas() {
		return lajas > 0;
	}
}
