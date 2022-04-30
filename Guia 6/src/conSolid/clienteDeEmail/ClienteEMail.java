package conSolid.clienteDeEmail;

import java.util.List;

public class ClienteEMail {
	
	Servidor servidor;
	String nombreUsuario;
	String passusuario;
	CasillaDeMails mails;
	
	public ClienteEMail(Servidor servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.mails = new CasillaDeMails();

		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void recibirNuevos(){
		List<Correo>mails = this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
		this.mails.addMails(mails);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
