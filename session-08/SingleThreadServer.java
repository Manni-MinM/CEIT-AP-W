// BWOTSHEWCHB

import java.io.IOException ;
import java.io.ObjectInputStream ;
import java.io.ObjectOutputStream ;

import java.net.Socket ;
import java.net.ServerSocket ;

public class SingleThreadServer {
	public static void main(String[] args) {
		try ( ServerSocket serverSocket = new ServerSocket(6969) ) {
			System.out.println("[SERVER STARTED]") ;
			try ( Socket connection = serverSocket.accept() ) {
				System.out.println("[CONNECTION ESTABLISHED]") ;

				ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream()) ;
				ObjectInputStream in = new ObjectInputStream(connection.getInputStream()) ;
				
				String str = "" ;
				String clientInput = "" ;
				do {
					try {
						clientInput = (String)in.readObject() ;
						System.out.println("RECV : " + clientInput) ;
						str += clientInput + " " ;
						out.writeObject(str) ;
						out.flush() ;
						System.out.println("SENT : " + str) ;
					} catch ( ClassNotFoundException exception ) {
						exception.printStackTrace() ;
					}
				} while ( !clientInput.equals("over") ) ;

				in.close() ;
				out.close() ;
			} catch ( IOException exception ) {
				exception.printStackTrace() ;
			}
		} catch ( IOException exception ) {
			exception.printStackTrace() ;
		}
		System.out.println("[SERVER CLOSED]") ;
	}
}

