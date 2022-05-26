package encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements Suscriptor{
	
	List<String> suscripciones;
	RegistradorDePartidos observado;
	List<Partido> partidosObservados;
	
	public Servidor (RegistradorDePartidos r) {
		suscripciones = new ArrayList<String>();
		partidosObservados = new ArrayList<Partido>();
		observado = r;
		r.addSuscriptor(this);
	}
	
	@Override
	public void update(String deporte, List<String> contrincantes) {
		// TODO Auto-generated method stub
		if(this.esCategoria(deporte)) {
			partidosObservados.add(observado.getLastPartido());
		}
		
	}

	private boolean esCategoria(String categoria) {
		return suscripciones.stream().anyMatch(s -> s.contains(categoria));
	}

	@Override
	public void suscribir(String categoria) {
		suscripciones.add(categoria);
	}
}
