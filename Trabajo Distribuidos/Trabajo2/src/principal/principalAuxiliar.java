package principal;

import java.awt.EventQueue;
import java.util.ArrayList;

public class principalAuxiliar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInfoRa�cesExtra frameInfo = new VentanaInfoRa�cesExtra("polinomio", "derivada", "1 4", "2 5",  "[[1, 2, 3], [4, 5], [6]]", "1 2 3","5");
					frameInfo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
