package ar.edu.unq.po2.tp3;

public class Rectangulo {

	int ancho, largo;
	Point esqInf;
	
	public Rectangulo (Point p, int a, int l) {
		this.setAncho(a);
		this.setEsqInf(p);
		this.setLargo(l);
	}

	public int getAncho() {
		return ancho;
	}

	private void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	private void setLargo(int largo) {
		this.largo = largo;
	}

	private void setEsqInf(Point esqInf) {
		this.esqInf = esqInf;
	}

	public int perimetro() {
		return (this.getLargo()*2) + (this.getAncho()*2);
	}

	public int area() {
		return (this.getAncho()*this.getLargo());
	}

	public boolean esVertical() {
		return (this.getAncho() < this.getLargo());
	}

	public boolean esHorizontal() {
		return (this.getAncho() > this.getLargo());
	}
}
