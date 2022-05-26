package encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class RegistradorDePartidos {

	List<Partido> partidos;
	List<Suscriptor> suscriptores;
	
	public RegistradorDePartidos() {
		partidos = new ArrayList<Partido>();
		suscriptores = new ArrayList<Suscriptor>();
	}
	
	public void registrarPartido(Partido p) {
		partidos.add(p);
		this.notify(p.getDeporte(), p.getContrincantes());
	}

	private void notify(String deporte, List<String> contrincantes) {
		suscriptores.forEach(s -> s.update(deporte, contrincantes));
	}
	
	public void addSuscriptor(Suscriptor s) {
		suscriptores.add(s);
	}
	
	public void removeSuscriptor(Suscriptor s) {
		suscriptores.remove(s);
	}
	
	public Partido getLastPartido() {
		return partidos.get(partidos.size()-1);
	}
}
