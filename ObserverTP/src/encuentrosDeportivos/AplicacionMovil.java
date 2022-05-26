package encuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements Suscriptor{

	List<String> suscripciones;
	RegistradorDePartidos observado;
	List<Partido> partidosObservados;
	
	public AplicacionMovil (RegistradorDePartidos r) {
		suscripciones = new ArrayList<String>();
		partidosObservados = new ArrayList<Partido>();
		observado = r;
		r.addSuscriptor(this);
	}
	
	@Override
	public void update(String deporte, List<String> contrincantes) {
		// TODO Auto-generated method stub
		contrincantes.add(deporte);
		if(this.esCategoria(contrincantes)) {
			partidosObservados.add(observado.getLastPartido());
		}
		
	}

	private boolean esCategoria(List<String> categoria) {
		return categoria.stream().anyMatch(s -> suscripciones.contains(s));
	}

	@Override
	public void suscribir(String categoria) {
		suscripciones.add(categoria);
	}

}
