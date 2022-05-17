package fileSystem;

import java.util.ArrayList;

public class Directorio implements FyleSystem {

	ArrayList<FyleSystem> contenido;
	String name;
	
	public Directorio(String n) {
		contenido = new ArrayList<FyleSystem>();
		name = n;
	}
	
	public void add(FyleSystem f) {
		contenido.add(f);
	}
	
	public void remove(FyleSystem f) {
		contenido.remove(f);
	}
	
	@Override
	public int totalSize() {
		return contenido.stream()
				.mapToInt(e -> e.totalSize())
				.sum();
	}

	@Override
	public void printStructure() {
		System.out.println(name);
		for(FyleSystem c: contenido) {
			c.printStructure();
		}
	}

	@Override
	public FyleSystem lastModified() {
		return contenido.get(contenido.size()-1);
	}

	@Override
	public FyleSystem oldestElement() {
		return contenido.get(0);
	}

}
