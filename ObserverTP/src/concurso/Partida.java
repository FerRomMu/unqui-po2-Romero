package concurso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Partida {

	List<Participante> participantes;
	HashMap<Participante, Integer> puntuaciones;
	List<Pregunta> preguntas;
	boolean iniciada = false;
	
	public Partida(Pregunta p1, Pregunta p2, Pregunta p3, Pregunta p4, Pregunta p5) {
		participantes = new ArrayList<Participante>();
		puntuaciones = new HashMap<Participante,Integer>();
		preguntas = new ArrayList<Pregunta>();
		preguntas.add(p5);
		preguntas.add(p4);
		preguntas.add(p3);
		preguntas.add(p2);
		preguntas.add(p1);
	}
	
	public void addParticipante(Participante p) {
		if(iniciada) {
			System.out.println("Error: Partida comenzada.");
			return;
		}
		
		participantes.add(p);
		p.setCuestionario(preguntas);
		
		if(this.haySuficientesParticipantes()) {
			this.initPartida();
		}
	}
	
	private boolean haySuficientesParticipantes() {
		return participantes.size() == 5;
	}

	private void initPartida(){
		iniciada = true;
		participantes.stream().forEach(p -> p.updateComenzar());
	}
	
	private boolean terminoPartida() {
		return preguntas.isEmpty();
	}
	
	private Participante getMasPuntuacion() {
		return puntuaciones.entrySet()
				.stream()
				.max((entry1,entry2) -> entry1.getValue() - entry2.getValue())
				.get().getKey();
	}

	public void recibirRespuesta(String r, Pregunta p, Participante j) {
		if(!this.esRespuestaValida(p)) {
			System.out.println("Error: La pregunta ya había sido respondida o es invalida.");
			return;
		}
		if(!iniciada) {
			System.out.println("Error: El juego aún no comenzo.");
			return;
		}
		if(!p.esCorrecta(r)) {
			j.updateIncorrecta();
			return;
		}
		
		//Se puntua, se quita la pregunta del juego y se notifica.
		puntuaciones.put(j, puntuaciones.getOrDefault(j, 0) +1);
		preguntas.remove(p);
		
		if(this.terminoPartida()) {
			this.notifyGanador(this.getMasPuntuacion());
		}else {			
			this.notifyCorrecta(j.getName(), p.getPregunta());
		}
	}
	
	private boolean esRespuestaValida(Pregunta p) {
		//Por diseño se decidió retirar las preguntas respondidas.
		//Si se requiriesen (por ejemplo para reiniciar el juego)
		//Habría que utilizar una segunda lista suplementaria.
		return preguntas.contains(p);
	}

	private void notifyGanador(Participante p) {
		participantes.stream().forEach(pa -> pa.updateGanador(p.getName()));
	}
	
	private void notifyCorrecta(String j, String p) {
		participantes.stream().forEach(pa -> pa.updateCorrecta(j,p));
	}
	
}
