package encuentrosDeportivos;

import java.util.List;

public interface Suscriptor {

	public void update(String deporte, List<String> contrincantes);
	
	public void suscribir(String categoria);
	
}
