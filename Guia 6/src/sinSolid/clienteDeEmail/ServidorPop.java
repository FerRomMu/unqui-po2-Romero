package sinSolid.clienteDeEmail;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop {
	public List<Correo> recibirNuevos(String user, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
	  //Verificar autenticidad de usuario.
		//obtener emails Nuevos del usuario.
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	   //Verifica que el usuario sea valido y establece la conexion.
		
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.		
	}

	
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	
	public void resetear() {
         //no corresponde		
	}

	
	public void realizarBackUp() {
		//no corresponde
		
	}
}
