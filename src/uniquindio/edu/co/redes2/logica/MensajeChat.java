package uniquindio.edu.co.redes2.logica;

import java.util.Observable;

public class MensajeChat extends Observable{

	private String mensaje;
	
	public MensajeChat() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
		//Indica que el mensaje ha cambiado
		this.setChanged();
		//Notifiaca a los observadores que el mensaje ha cambiado y se lo pasa
		//(Internamente notifyObservers llama al metodo update del observador)
		this.notifyObservers(this.getMensaje());
	}
}
