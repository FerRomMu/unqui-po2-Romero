package banco;

/**
 * Clase abstracta. Se encarga de moldear el comportamiento
 * basico de una solicitud de credito.
 * @author fercho
 *
 */
public abstract class SolicitudDeCredito implements Solicitud {
	
	ICliente solicitante;
	int plazo;
	double monto;
	
	/**
	 * Constructor.
	 * @param m el monto total pedido.
	 * @param p el plazo de tiempo que se pide.
	 * @param c el ICliente solicitante.
	 */
	public SolicitudDeCredito(double m, int p, ICliente c) {
		solicitante = c;
		plazo = p;
		monto = m;
	}

	/**
	 * Devuelve el monto total del credito pedido.
	 */
	@Override
	public double getMontoTotal() {
		return monto*plazo;
	}

	/**
	 * Indica si la solicitud es aceptable.
	 */
	@Override
	public abstract boolean esAceptable();

	public double getMontoMensual() {
		return monto;
	}
	
	public ICliente getSolicitante() {
		return solicitante;
	}
}
