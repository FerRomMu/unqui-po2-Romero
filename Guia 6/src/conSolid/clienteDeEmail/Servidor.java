package conSolid.clienteDeEmail;

import java.util.List;

public interface Servidor {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	
}
