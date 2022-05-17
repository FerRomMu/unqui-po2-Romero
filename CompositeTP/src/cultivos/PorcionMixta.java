package cultivos;

public class PorcionMixta extends Porcion {

	Porcion p1,p2,p3,p4;

	public PorcionMixta(Porcion a, Porcion b, Porcion c, Porcion d) {
		p1 = a;
		p2 = b;
		p3 = c;
		p4 = d;
	}
	
	@Override
	public double getGananciaAnual() {
		return (p1.getGananciaAnual() 
				+ p2.getGananciaAnual()
				+ p3.getGananciaAnual()
				+ p4.getGananciaAnual())
				/4;
	}
	
	
}
