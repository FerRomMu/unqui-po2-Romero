package seresVivos;

public class Mascota implements SerVivo{
	
	String nombre,raza;
	
	public Mascota(String n, String r) {
		nombre = n;
		raza = r;
	}

	public String getName() {
		return nombre;
	}
	
	public String getRaza() {
		return raza;
	}
}
