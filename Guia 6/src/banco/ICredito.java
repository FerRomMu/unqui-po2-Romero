package banco;

public interface ICredito {

	public double getCuota();
	
	public ICliente getCliente();
	
	public void registrarPagoDeCuota();
	
	public boolean estaPagada();
	
}
