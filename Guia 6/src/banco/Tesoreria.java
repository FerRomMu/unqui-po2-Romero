package banco;

import java.util.ArrayList;

/**
 * Objeto encargado de administrar los productos financieros
 * del banco. Administra las solicitudes y guarda los productos
 * ya acreditados.
 * @author fercho
 *
 */
public class Tesoreria {

	ArrayList<Solicitud> solicitudesPendientes;
	ArrayList<ICredito> creditos;
	
	public Tesoreria() {
		creditos = new ArrayList<ICredito>();
		solicitudesPendientes = new ArrayList<Solicitud>();
	}
	
	public void addSolicitudCredito(SolicitudDeCredito cp) {
		solicitudesPendientes.add(cp);
	}
	
	public double getMontoTotalSolicitudes() {
		return solicitudesPendientes.stream()
				.filter(solicitud -> solicitud.esAceptable())
				.mapToDouble(solicitud -> solicitud.getMontoTotal())
				.sum();
	}

	public void acceptSolicitudCredito(SolicitudDeCredito s, ICredito c) {
		if(s.esAceptable() && solicitudesPendientes.contains(s)) {
			solicitudesPendientes.remove(s);
			creditos.add(c);
		}else {
			System.out.println("Error: Solicitud invalida.");
		}
	}
}
