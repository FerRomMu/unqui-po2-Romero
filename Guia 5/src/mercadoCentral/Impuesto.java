package mercadoCentral;

public class Impuesto implements Utilidad, Factura {

	double tasa;
	Agencia agencia;
	
	public Impuesto (Agencia a, double t) {
		tasa = t;
		agencia = a;
	}
	
	@Override
	public double getPrecio() {
		return tasa;
	}

	@Override
	public void procesarPago() {
		agencia.registrarPago(this);
	}

}
