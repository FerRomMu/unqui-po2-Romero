package banco;

/**
 * Se encarga de guardar la información de un determinado
 * credito ya concedido.
 * @author fercho
 *
 */
public class Credito implements ICredito {

	double cuotaMensual;
	int cuotasRestantes;
	ICliente cliente;
	
	/**
	 * Constructor de Credito.
	 * @param d el valor de la cuota mensual
	 * @param i la cantidad de cuotas a pagar
	 * @param c el cliente al que se le acredito
	 */
	public Credito(double d, int i, ICliente c) {
		cuotaMensual = d;
		cuotasRestantes = i;
		cliente = c;
	}

	/**
	 * Retorna si ya se pagaron todas las cuotas.
	 * @return el bool si esta pagada
	 */
	@Override
	public boolean estaPagada() {
		return cuotasRestantes == 0;
	}
	
	/**
	 * Registra el pago de una cuota.
	 * Disminuyendo en 1 la cantidad de cuotas a pagar.
	 */
	@Override
	public void registrarPagoDeCuota() {
		if (cuotasRestantes > 0) {
			cuotasRestantes -= 1;
		}
	}
	
	/**
	 * El cliente al que se le acredito
	 * el credito.
	 * @return el ICliente
	 */
	@Override
	public ICliente getCliente() {
		return cliente;
	}

	/**
	 * La cuota mensual a pagar.
	 * @return el valor de la cuota.
	 */
	@Override
	public double getCuota() {
		return cuotaMensual;
	}
}
