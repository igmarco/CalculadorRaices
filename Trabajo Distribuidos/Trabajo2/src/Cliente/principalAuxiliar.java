package Cliente;

public class principalAuxiliar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					VentanaInfoRa�cesExtra frameInfo = new VentanaInfoRa�cesExtra("polinomio", "derivada", "1 4", "2 5",  "[[1, 2, 3], [4, 5], [6]]", "1 2 3","5");
//					frameInfo.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		
		System.out.println(ponerFormatoPolinomio("5, 4, 3"));
	}
	
private static String ponerFormatoPolinomio(String polStr) {
		
		String pol = "";
		
		String coeficientes[] = polStr.replace(" ", "").split(",");
		
		int i = coeficientes.length;
		
		for(String coef : coeficientes) {
			
			pol = pol + " \\+ " + coef + "x^" + ((Integer)(i-1)).toString();
			
			i--;
			
		}
		
		return pol.substring(3);
		
	}

}
