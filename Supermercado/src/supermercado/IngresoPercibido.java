package supermercado;

public class IngresoPercibido {
	
	String mes, concepto;
	double monto;

	public String getMes() {
		return mes;
	}

	private void setMes(String mes) {
		this.mes = mes;
	}

	public String getConcepto() {
		return concepto;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return monto;
	}

	private void setMonto(double monto) {
		this.monto = monto;
	}

	public IngresoPercibido(String m, String c, double mo) {
		this.setConcepto(c);
		this.setMes(m);
		this.setMonto(mo);
	}

	public double getImponible() {
		return this.getMonto();
	}
	
}
