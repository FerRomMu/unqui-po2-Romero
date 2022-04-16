package supermercado;

import java.util.ArrayList;

public class Supermercado {

	String nombre, dir;
	ArrayList<Producto>prods;
	
	public Supermercado(String n, String d) {
		this.setNombre(n);
		this.setDireccion(d);
		prods = new ArrayList<Producto>();
	}

	private void setNombre(String n) {
		this.nombre = n;
	}

	private void setDireccion(String d) {
		this.dir = d;
	}

	public int getCantidadDeProductos() {
		return prods.size();
	}

	public void agregarProducto(Producto p) {
		prods.add(p);
	}

	public Double getPrecioTotal() {
		Double total = 0d;
		for(Producto pr:prods) {
			total += pr.getPrecio();
		}
		return total;
	}

}
