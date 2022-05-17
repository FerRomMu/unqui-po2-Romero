package warcraft;

import java.util.ArrayList;

public class Ejercito extends Caracter{

	ArrayList<Caracter> c;
	
	public Ejercito() {
		c = new ArrayList<Caracter>();
	}

	@Override
	public void caminar(Punto p) {
		c.forEach((c) -> {
			c.caminar(p);
		});
	}
	
	@Override
	public Ejercito add(Caracter ch) {
		c.add(ch);
		return this;
	}
	
	@Override
	public Ejercito remove(Caracter ch) {
		c.remove(ch);
		return this;
	}
}
