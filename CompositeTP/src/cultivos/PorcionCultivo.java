package cultivos;

public class PorcionCultivo extends Porcion {

	Cultivo tipo;
	
	public enum Cultivo {
		TRIGO(300d), SOJA(500d);
		double precio;
		
		Cultivo(double d){
			precio = d;
		}
		
		public double getPrecio() {
			return precio;
		}
	}
	
	public PorcionCultivo(Cultivo c) {
		tipo = c;
	}

	@Override
	public double getGananciaAnual() {
		return tipo.getPrecio();
	}

}
