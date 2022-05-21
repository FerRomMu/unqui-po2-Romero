package articulos;

import java.util.ArrayList;
import java.util.List;

public class Articulo {

	List<String> autores, filiaciones, keywords, titulo, tipo, lugar;

	public Articulo(String t, List<String> a, List<String> f, String ti, String l, List<String> kw) {
		titulo = new ArrayList<String>();
		titulo.add(t);
		tipo = new ArrayList<String>();
		tipo.add(ti);
		lugar = new ArrayList<String>();
		lugar.add(l);
		autores = a;
		filiaciones = f;
		keywords = kw;
	}
	
	public List<String> getTitulo() {
		return titulo;
	}

	public List<String> getTipo() {
		return tipo;
	}

	public List<String> getLugar() {
		return lugar;
	}

	public List<String> getAutores() {
		return autores;
	}

	public List<String> getFiliaciones() {
		return filiaciones;
	}

	public List<String> getKeywords() {
		return keywords;
	}

}
