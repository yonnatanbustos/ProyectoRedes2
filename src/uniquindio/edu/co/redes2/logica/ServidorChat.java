package uniquindio.edu.co.redes2.logica;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class ServidorChat {

	public static void main(String[] args) {

		
		//Logger logger = Logger.getLogger(ServidorChat.class);
		int puerto =1234;
		int maximoSocket=2;
		ServerSocket servidor= null;
		Socket socket=null;
		MensajeChat mensajes = new MensajeChat();
		
		try{
			//Se crea el serversocket
			servidor = new ServerSocket(puerto, maximoSocket);
			
			//Bucle infinito para esperar conexiones
			while(true){
				//logger.info("Servidor a la espera de conexiones.");
				System.out.println("Servidor a la espera de conexiones.");
				socket = servidor.accept();
				System.out.println("Cliente con la IP: "+socket.getInetAddress().getHostName()+ " conectado.");
				
				ConexionCliente cc = new ConexionCliente(socket, mensajes);
				cc.start();
				
			}
		}catch(IOException e){
			System.err.println("Error: "+e.getMessage());
		}finally{
			try{
				servidor.close();

				socket.close();
			}catch(IOException e){
				System.err.println("Error al cerrar el servidor: "+e.getMessage());
			}
		}
	}

}
