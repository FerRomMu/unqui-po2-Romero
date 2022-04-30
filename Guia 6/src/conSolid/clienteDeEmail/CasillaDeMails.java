package conSolid.clienteDeEmail;

import java.util.ArrayList;
import java.util.List;

public class CasillaDeMails {

	ArrayList<Correo> inbox, borrados;
	
	public CasillaDeMails() {
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}

	public void addMails(List<Correo> mails) {
		mails.stream().forEach(correo -> inbox.add(correo));
	}
}
