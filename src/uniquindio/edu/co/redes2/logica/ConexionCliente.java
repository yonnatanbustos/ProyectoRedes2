package uniquindio.edu.co.redes2.logica;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Observable;
import java.util.Observer;

public class ConexionCliente extends Thread implements Observer{

	private Socket socket;
	private MensajeChat mensajes;
	private DataInputStream entradaDatos;
	private DataOutputStream salidaDatos;
	
	public ConexionCliente(Socket socket, MensajeChat mensajes) {
		this.socket = socket;
		this.mensajes = mensajes;
		
		try{
			entradaDatos = new DataInputStream(socket.getInputStream());
			salidaDatos = new DataOutputStream(socket.getOutputStream());
			
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error al crear los stream de entrada y salida: "+e.getMessage());
		}
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String mensajeRecibido;
		boolean conectado = true;
		//Se apunta a la lista de observadores de mensajes
		mensajes.addObserver(this);
		
		while(conectado){
			try{
				//Lee un mensaje enviado por el cliente
				mensajeRecibido = entradaDatos.readUTF();
				//Pone el mensaje recibido en mensajes para que se notifique
				//a sus observadores que hay un nuevo mensaje
				mensajes.setMensaje(mensajeRecibido);
				
			}catch(IOException e){
				System.out.println("Cliente con la IP "+ socket.getInetAddress().getHostName() +" desconectado.");
				conectado = false;
				//Si se ha producido un error al recibir datos del cliente se cierra la conexion con el.
				try{
					entradaDatos.close();
					salidaDatos.close();					
				}catch(IOException e2){
					System.out.println("Error al cerrar los streams de entrada y salida: "+ e2.getMessage());
				}
			}
		}
		
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		try{
			//Envia el mensaje al cliente
			salidaDatos.writeUTF(arg.toString());
			
		}catch(IOException e){
			System.out.println("Error al enviar mensaje al cliente ("+ e.getMessage() +").");
		}
	}
	

}
