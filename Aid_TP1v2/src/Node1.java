
public class Node1 {
		
	
		public static String inicial = new String();
	
		public static void ordenarNumeros() {
			int valor = inicial.indexOf('0');
			
			String temp = "" ;
			
			if (valor > 2) { // só pode  a 2º e 3ª linha mover para cima
				
				// System.out.println(inicial.charAt( valor - 3) );		
			   temp = inicial.replace('0',inicial.charAt( valor - 3));
				
			}
			if(valor % 3 != 0) {
			
			 
				
				temp = inicial.replace('0',inicial.charAt( valor - 1));
			}
			
			if (valor % 3 != 2) {
				
				
				
				temp = inicial.replace('0',inicial.charAt( valor + 1));
				
			}
			if (valor  < 6) {
				
			
				 
				temp = inicial.replace('0',inicial.charAt( valor + 3));
				
			
		}
}
