package concurso;

public class Pregunta {

	String pregunta, respuesta;
	
	public Pregunta(String p, String r) {
		pregunta = p;
		respuesta = r;
	}
	
	public String getPregunta() {
		return pregunta;
	}
	
	public boolean esCorrecta(String r) {
		return r == respuesta;
	}
}
