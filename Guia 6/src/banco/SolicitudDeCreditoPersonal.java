package banco;

/**
 * Describe el comportamiento de un credito personal.
 * @author fercho
 *
 */
public class SolicitudDeCreditoPersonal extends SolicitudDeCredito{

	public SolicitudDeCreditoPersonal(double m, int p, ICliente c) {
		super(m, p, c);
	}

	/**
	 * Indica si el credito es aceptable.
	 */
	@Override
	public boolean esAceptable() {
		// TODO Auto-generated method stub
		return this.cumpleIngresoMensual()
				&& this.cumpleIngreAnual();
	}

	/**
	 * Subtarea de esAceptable.
	 * Indica si cumple el requisito del ingreso
	 * mensual.
	 * @return verdadero si lo cumple.
	 */
	private boolean cumpleIngresoMensual() {
		return this.getMontoMensual() <= 
				solicitante.getSueldoNeto()*0.7;
	}

	/**
	 * Subtarea de esAceptable
	 * Indica si cumple el requisito del ingreso
	 * anual.
	 * @return verdadero si lo cumple.
	 */
	private boolean cumpleIngreAnual() {
		return solicitante.getSueldoAnual() >= 15000d;
	}

}
