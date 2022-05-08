package banco;

/**
 * Se encarga de guardar la información de una determinada
 * propiedad que puede ser dada en garantia.
 * @author fercho
 *
 */
public class Propiedad implements Garantia {

	String descripcion, direccion;
	double valorFiscal;
	
	/**
	 * Constructor
	 * @param d es la descripción de la propiedad.
	 * @param dir es la direccion de la propiedad.
	 * @param v es el valor fiscal de la propiedad.
	 */
	public Propiedad(String d, String dir, double v) {
		descripcion = d;
		direccion = dir;
		valorFiscal = v;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	@Override
	public double getValorFiscal() {
		return valorFiscal;
	}

}
