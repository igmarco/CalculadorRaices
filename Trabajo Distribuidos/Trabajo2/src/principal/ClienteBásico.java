package principal;

import java.io.IOException;
import java.net.Socket;

public class ClienteB�sico {
	
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost",48500);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
