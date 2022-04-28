package seresVivos;

import java.time.LocalDate;

public class Persona implements SerVivo {
	
	String nombre;
	LocalDate date;
	
	public Persona(String n, LocalDate d) {
		nombre = n;
		date = d;
	}

	public String getName() {
		return nombre;
	}
	
	public LocalDate getFechaDeNac() {
		return date;
	}
	
	public int getEdad() {
		LocalDate nac = this.getFechaDeNac();
		LocalDate hoy = LocalDate.now();
		int e = hoy.getYear() - nac.getYear();
		if (!this.cumpliAños()) {
			e -= 1;
		}
		return e;
	}
	
	private boolean cumpliAños() {
		LocalDate hoy = LocalDate.now();
		return hoy.getDayOfYear() >= this.getCumpleaños();
	}
	
	public int getCumpleaños() {
		return this.getFechaDeNac().getDayOfYear();
	}
	
	public boolean menorQue(Persona p) {
		return this.getEdad() < p.getEdad() || (this.getEdad() == p.getEdad() && this.getCumpleaños() > p.getCumpleaños());
	}
}
