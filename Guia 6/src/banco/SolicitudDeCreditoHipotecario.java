package banco;

/**
 * Se encarga del comportamiento de un solicitud de credito
 * hipotecario.
 * @author fercho
 *
 */
public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {

	Garantia garantia;
	
	/**
	 * Ademas de los parametros de otra solicitudes de credito
	 * tambien requiere de la garantia.
	 * @param c el cliente solicitante.
	 * @param m el monto solicitado.
	 * @param p el plazo solicitado.
	 * @param g la garantia dada.
	 */
	public SolicitudDeCreditoHipotecario(ICliente c, double m, int p, Garantia g) {
		super(m,p,c);
		garantia = g;
	}
	
	/**
	 * Indica si la solicitud es valida.
	 */
	@Override
	public boolean esAceptable() {
		return this.cumpleIngresoMensual()
				&& this.cumpleValorFiscal()
				&& this.cumpleEdad();
	}

	/**
	 * Subtarea de esAceptable.
	 * Indica si cumple con el requisito de edad.
	 * @return verdadero si lo cumple.
	 */
	private boolean cumpleEdad() {
		return (solicitante.getEdad() + this.añosExtra()) <= 65;
	}

	/**
	 * Subtarea de cumple edad.
	 * Describe la cantidad de años que dura el credito.
	 * @return un int que representa los años.
	 */
	private int añosExtra() {
		return plazo / 12;
	}

	/**
	 * Subtarea de esAceptable.
	 * Indica si la garantia cumple con el valor fiscal
	 * requerido.
	 * @return verdadero si lo cumple.
	 */
	private boolean cumpleValorFiscal() {
		return garantia.getValorFiscal()*0.7 >= monto;
	}

	/**
	 * Subtarea de esAceptable.
	 * Indica si el solicitante cumple con el ingreso 
	 * mensual requerido.
	 * @return verdadero si lo cumple.
	 */
	private boolean cumpleIngresoMensual() {
		return this.getMontoMensual() <= 0.5*solicitante.getSueldoNeto();
	}

}
