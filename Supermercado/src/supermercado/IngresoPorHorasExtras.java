package supermercado;

public class IngresoPorHorasExtras extends IngresoPercibido {

	int horas = 0;
	
	public IngresoPorHorasExtras(String m, String c, double mo, int h) {
		super(m,c,mo);
		this.setHorasExtras(h);
	}
	
	private void setHorasExtras(int h) {
		this.horas = h;
	}

	public Integer getHorasExtras() {
		return this.horas;
	}
	
	@Override
	public double getImponible() {
		return 0d;
	}

}
