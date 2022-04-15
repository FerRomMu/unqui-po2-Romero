package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {

	String nombre;
	LocalDate nac;
	
	public Persona(String nom, LocalDate nac) {
		this.setNac(nac);
		this.setNombre(nom);
	}
	
	public Persona(String nom, int y, int m, int d) {
		this.setNombre(nom);
		this.setNac(y,m,d);
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getNac() {
		return nac;
	}

	private void setNac(LocalDate nac) {
		this.nac = nac;
	}
	
	private void setNac(int y, int m, int d) {
		this.nac = LocalDate.of(y, m, d);
	}
	
	public int edad() {
		LocalDate nac = this.getNac();
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
		return this.getNac().getDayOfYear();
	}

	public boolean menorQue(Persona p) {
		return this.edad() < p.edad() || (this.edad() == p.edad() && this.getCumpleaños() > p.getCumpleaños());
	}
}
