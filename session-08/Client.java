// BWOTSHEWCHB

import java.util.Scanner ;

import java.io.IOException ;
import java.io.ObjectInputStream ;
import java.io.ObjectOutputStream ;

import java.net.Socket ;

public class Client {
	public static void main(String[] args) {
		System.out.println("[STARTING CLIENT]") ;
		try ( Socket clientSocket = new Socket("127.0.0.1" , 6969) ) {
			System.out.println("[CONNECTED TO SERVER]") ;

			ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream()) ;
			ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream()) ;

			String clientInput = "" ;
			Scanner scanner = new Scanner(System.in) ;
			do { 
				clientInput = scanner.nextLine() ;
				out.writeObject(clientInput) ;
				System.out.println("SENT : " + clientInput) ;
				try {
					String serverOutput = (String)in.readObject() ;
					System.out.println("RECV : " + serverOutput) ;
				} catch ( ClassNotFoundException exception ) {
					exception.printStackTrace() ;
				}
			} while ( !clientInput.equals("over") ) ;

			in.close() ;
			out.close();
		} catch ( IOException exception ) {
			exception.printStackTrace() ;
		}
		System.out.println("[CLIENT CLOSED]") ;
	}
}

