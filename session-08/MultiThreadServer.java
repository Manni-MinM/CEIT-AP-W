// BWOTSHEWCHB

import java.io.IOException ;
import java.io.ObjectInputStream ;
import java.io.ObjectOutputStream ;

import java.net.Socket ;
import java.net.ServerSocket ;

import java.lang.Thread ;

/**
 * A Class to hold information about the Handler
 *
 * @author Manni Moghimi
 * @version v1.0
 */
class Handler extends Thread {
	// Fields
	private int clientNum ;
	private Socket connection ;
	// Constructor
	/**
	 * Creates Handler Object
	 *
	 * @param clientNum The number of the connection of the Client
	 * @param connection The Socket of the connection
	 */
	public Handler(int clientNum , Socket connection) {
		this.clientNum = clientNum ;
		this.connection = connection ;
	}
	// Methods
	/**
	 * Run method of the Thread
	 */
	@Override
	public void run() {
		try {
			System.out.println("[CONNECTION ESTABLISHED] => NO : " + clientNum) ;

			ObjectOutputStream out = new ObjectOutputStream(connection.getOutputStream()) ;
			ObjectInputStream in = new ObjectInputStream(connection.getInputStream()) ;

			String str = "" ;
			String clientInput = "" ;
			do {
				try {
					clientInput = (String)in.readObject() ;
					System.out.println("[CONNECTION NO => " + clientNum + "] RECV : " + clientInput) ;
					str += clientInput + " " ;
					out.writeObject(str) ;
					System.out.println("[CONNECTION NO => " + clientNum + "] SENT : " + str) ;
				} catch ( ClassNotFoundException exception ) {
					exception.printStackTrace() ;
				}
			} while ( !clientInput.equals("over") ) ;

			in.close() ;
			out.close() ;
			
		} catch ( IOException exception ) {
			exception.printStackTrace() ;
		}
	}
}
/**
 * A Class to hold information about the Multi Thread Server
 *
 * @author Manni Moghimi
 * @version v1.0
 */
public class MultiThreadServer {
	public static void main(String[] args) {
		try ( ServerSocket serverSocket = new ServerSocket(6969) ) {
			System.out.println("[SERVER STARTED]") ;
			while ( true ) {
				Socket connection = serverSocket.accept() ;
				Thread thread = new Thread(new Handler(Thread.activeCount() , connection)) ;
				thread.start() ;
			}
		} catch ( IOException exception ) {
			exception.printStackTrace() ;
		}
	}
}

