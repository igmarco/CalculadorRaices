package principal;

import java.net.Socket;

public class CalcularRaices extends Thread{
	
	private Socket s;
	private String polinomio;
	
	public CalcularRaices(Socket s, String polinomio) {
		this.s = s;
		this.polinomio = polinomio;
	}
	
	public void run() {
		//En este hilo que ser� unico para cada cliente, 1� con la regla de signos de Descarte
		//tratar de ver m�s o menos cuantas raices positivas y negativas reales.
		//2� acotaci�n de las raices con MacLaurin
		//3�
		
		
	}

}
