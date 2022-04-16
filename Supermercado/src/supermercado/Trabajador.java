package supermercado;

import java.util.ArrayList;

public class Trabajador {

	ArrayList<IngresoPercibido> ingresosAnuales;
	
	public Trabajador() {
		ingresosAnuales = new ArrayList<IngresoPercibido>();
	}
	
	public Trabajador recibirIngreso(IngresoPercibido i) {
		ingresosAnuales.add(i);
		return this;
	}
	
	public double getTotalPercibido() {
		double total=0;
		for(IngresoPercibido ingreso:ingresosAnuales) {
			total += ingreso.getMonto();
		}
		return total;
	}

	public double getMontoImponible() {
		double total=0;
		for(IngresoPercibido ingreso:ingresosAnuales) {
			total += ingreso.getImponible();
		}
		return total;
	}

	public double getImpuestosAPagar() {
		
		return this.getMontoImponible() * 0.02;
	}

}
