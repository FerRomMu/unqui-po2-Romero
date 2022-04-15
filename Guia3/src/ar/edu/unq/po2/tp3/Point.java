package ar.edu.unq.po2.tp3;

public class Point {

	int x=0,y=0;
	
	public Point (int x, int y)  {
		this.setCoordenada(x, y);
	}
	
	public Point () {
	}
	
	private void setCoordenada(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}
	
	public void relocar(int x, int y) {
		this.setCoordenada(x, y);
	}
	
	public Point sumarPuntos(Point p) {
		int x = p.getX() + this.getX();
		int y = p.getY() + this.getY();
		Point np = new Point(x,y);
		return np;
	}
}
