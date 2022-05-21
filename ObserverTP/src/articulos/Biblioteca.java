package articulos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca extends Subject{
	
	List<Articulo> a;
	
	public Biblioteca() {
		super();
		a = new ArrayList<Articulo>();
	}
	
	public Biblioteca addArticle(Articulo ar) {
		a.add(ar);
		//Notifica nuevo articulo.
		this.notifyObservers(ar);
		return this;
	}
	
}
