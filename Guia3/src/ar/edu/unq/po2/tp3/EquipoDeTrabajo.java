package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	ArrayList<Persona> trabajadores = new ArrayList<Persona>();
	String nombre;
	
	public EquipoDeTrabajo(String n) {
		this.setNombre(n);
	}

	private void setNombre(String n) {
		this.nombre = n;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public EquipoDeTrabajo agregarAlEquipo(Persona p) {
		trabajadores.add(p);
		return this;
	}

	public Integer edadPromedio() {
		int ac=0;
		int c=0;
		for(Persona empleado:trabajadores) {
			c++;
			ac+= empleado.edad();
		}
		return ac/c;
	}

}
