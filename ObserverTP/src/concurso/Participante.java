package concurso;

import java.util.ArrayList;
import java.util.List;

public class Participante {

	String name;
	Partida pActual;
	List<Pregunta> cuestionario;
	
	public Participante(String n) {
		name = n;
		cuestionario = new ArrayList<Pregunta>();
	}

	public String getName() {
		return name;
	}
	
	public void participar(Partida p) {
		pActual = p;
		p.addParticipante(this);
	}
	
	public void responder(String r, Pregunta p) {
		pActual.recibirRespuesta(r, p, this);
	}
	
	public void updateComenzar() {
		//Recibe notificacion de que comenzó la partida
	}
	
	public void setCuestionario(List<Pregunta> p) {
		cuestionario = p;
	}
	
	public void updateCorrecta(String j, String p) {
		//Recibe notificacion de que hubo una respuesta
		//correcta del jugador j a la pregunta p
	}
	
	public void updateIncorrecta() {
		//Recibe notificacion de que su respuesta fue incorrecta.
	}
	
	public void updateGanador(String j) {
		//Recibo notificacion de que hay un ganador de nombre j.
	}
}
