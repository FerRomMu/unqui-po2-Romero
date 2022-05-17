package warcraft;

public class Punto {

	int x, y;
	
	public Punto(int a, int b) {
		this.setX(a);
		this.setY(b);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public boolean equals(Punto p) {
		return x == p.getX() && y == p.getY();
	}
}
