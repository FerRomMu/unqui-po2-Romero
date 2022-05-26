package encuentrosDeportivos;

import java.util.List;

public class Partido {

	String resultado, deporte;
	List<String> contrincantes;
	
	public Partido(String r, String d, List<String> c) {
		resultado = r;
		deporte = d;
		contrincantes = c;
	}

	public String getResultado() {
		return resultado;
	}

	public String getDeporte() {
		return deporte;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}
}
