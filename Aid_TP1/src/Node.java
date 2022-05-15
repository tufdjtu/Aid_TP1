import java.io.Console;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
	//Guardar o node 
	
		public Queue<Node> filho = new LinkedList<Node>();
		public Node pai;
		public int[]mapa =new int [9];
		public int x = 0 ;
		public int coluna = 3 ;
		public int id;
		
		
		public Node (int[]temp ) {
			
			SetMapa(temp);
			System.out.println(id);
			
		}
	
	
		public void SetMapa(int [] temp) {
			
			for(int i=0 ; i<mapa.length ; i++)
				
				this.mapa[i]=temp[i];
		
		}
		
		public void PossiMovimento() {
			for(int i = 0; i<mapa.length ; i++){
				
				if(mapa[i]==0) {
					x=i;
				}
			}
			
			moverDireita(mapa,x);
			moverEsquerda(mapa,x);
			moverCima(mapa,x);
			moverBaixo(mapa,x);
			
		}
		
		
		public boolean Verifica() {
			
			boolean objetivo = true; // bool ou bollean
			int temp1 = mapa[0];
			
			for(int i=0 ; i<mapa.length ; i++) {
				
				if(temp1>mapa[i])
					objetivo = false;
				
				temp1 =mapa[i];
			}
			
			return objetivo;
					
			
		}
	
	
		public void moverCima(int[] temp , int i) {
			
				if(i - coluna >=0) {
        		
        		int [] mapapai = new int [9];
        		copiaMapa(mapapai,temp);
        		
        		
        		int temp2 = mapapai[i-3];
        		mapapai[i-3] = mapapai[i];
        		mapapai[i]=temp2;
        		
        		Node filho1 = new Node(mapapai);
        		filho1.id = id + 1; 
        		filho.add(filho1);
        		filho1.pai = this;
        		
        			
        		
        		
        	}
		}

        public void moverBaixo(int[] temp , int i) {
        	
        		if(i + coluna < mapa.length) {
        		
        		int [] mapapai = new int [9];
        		copiaMapa(mapapai,temp);
        		
        		
        		int temp2 = mapapai[i+3];
        		mapapai[i+3] = mapapai[i];
        		mapapai[i]=temp2;
        		
        		Node filho1 = new Node(mapapai);
        		filho1.id = id + 1; 
        		filho.add(filho1);
        		filho1.pai = this;
        		
        		
        		
        		
        	}
			
		}
	
        public void moverDireita(int[] temp , int i) {
        	
        	if(i % coluna < coluna - 1) {
        		
        		int [] mapapai = new int [9];
        		copiaMapa(mapapai,temp);
        		
        		
        		int temp2 = mapapai[i+1];
        		mapapai[i+1] = mapapai[i];
        		mapapai[i]=temp2;
        		
        		Node filho1 = new Node(mapapai);
        		filho1.id = id + 1; 
        		filho.add(filho1);
        		filho1.pai = this;
        		
        		
        		
        		
        	}
			
		}
	
        public void moverEsquerda(int[] temp , int i) {
        	
        		if(i % coluna > 0) {
        		
        		int [] mapapai = new int [9];
        		copiaMapa(mapapai,temp);
        		
        		
        		int temp2 = mapapai[i-1];
        		mapapai[i-1] = mapapai[i];
        		mapapai[i]=temp2;
        		
        		Node filho1 = new Node(mapapai);
        		filho1.id = id + 1; 
        		filho.add(filho1);
        		filho1.pai = this;   		
        	}
        		
        }
        
        public void copiaMapa(int[]x ,int[] y) {
        	
        	for(int i =0 ; i <y.length ;i++) {
        		
        		
        		x[i]= y[i];
        		
        		
        	}
        }
	
        
        public void PrintMapa() {
        	
        	int cont=0;
        	
        	for(int i=0 ; i< coluna ;i++) {
        		
        		for(int j=0 ; j<coluna ;i++) {
        			
        			System.out.println(mapa[cont]+ "");
        			
        			cont++;	
        		}
        		System.out.println(mapa);
        	}
 }
        
        
        
        public boolean MapaRepetido(int[] temp) {
        	
        	boolean  sameMapa=true;
        	
        	for(int i =0 ; i < temp.length ; i++)
        	{
        		if(mapa[i]!= temp[i]) {
        			
        			sameMapa=false;
        		}

        	}
        	
        	return sameMapa;	
        }

        
        
        
        
        
        
        
        
        /*public static void ordenarNumeros(){
		//System.out.println(inicial.indexOf('0'));
		
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
	}*/
}
