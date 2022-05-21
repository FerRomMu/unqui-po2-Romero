package articulos;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Investigador implements Observer{
	
	EnumMap<Categoria,Set<String>> suscripcion;
	List<Articulo> articulos;
	
	public enum Categoria {
		TITULO {
			@Override
			public List<String> getDataFromCategoria(Articulo a) {
				return a.getTitulo();
			}			
		},AUTOR {
			@Override
			public List<String> getDataFromCategoria(Articulo a) {
				return a.getAutores();
			}			
		},FILIACION {
			@Override
			public List<String> getDataFromCategoria(Articulo a) {
				return a.getFiliaciones();
			}			
		},TIPO {
			@Override
			public List<String> getDataFromCategoria(Articulo a) {
				return a.getTipo();
			}
		},LUGAR {
			@Override
			public List<String> getDataFromCategoria(Articulo a) {
				return a.getLugar();
			}			
		},KEYWORD {
			@Override
			public List<String> getDataFromCategoria(Articulo a) {
				return a.getKeywords();
			}
		};
		public abstract List<String> getDataFromCategoria(Articulo a);
	}
	
	public Investigador() {
		suscripcion = new EnumMap<Categoria, Set<String>>(Categoria.class);
		articulos = new ArrayList<Articulo>();
	}
	
	public Investigador addSuscripcion(Categoria c, String s){
		Set<String> set;
		if(!suscripcion.containsKey(c)) {
			set = new HashSet<String>();
		}else {
			set = suscripcion.get(c);
		}
		set.add(s);
		suscripcion.put(c, set);
		return this;
	}

	@Override
	public void update(Object arg) {
		// TODO Auto-generated method stub
		if(this.isSuscribed((Articulo) arg)) {
			articulos.add((Articulo) arg);
		}
	}

	private boolean isSuscribed(Articulo arg) {
		boolean b = false;
		for(Categoria k: suscripcion.keySet()) {
			List<String> s = k.getDataFromCategoria(arg);
			Set<String> v = suscripcion.get(k);
			if(s.stream().anyMatch(str -> v.contains(str))) {
				b = true;
				break;
			}
		}
		return b;
	}

	public int getCantidadDeInteres() {
		return articulos.size();
	}
}
