
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		 int [] mapa =
			 {
					 7, 2 ,4,
					 5, 0, 6,
					 8 ,3, 1
			 };
		 
		Node Nodeinicial = new Node(mapa);
		 
		Search fv = new Search();
		
		Queue <Node> solution = fv.FirstSearch(Nodeinicial);
		
		if(solution.size()>0) {
			
			
			
			for(int i = 0 ;i< solution.size();i++) 
				 ((Node) solution).PrintMapa();
			
		}
		else {
			System.out.println("Nao existe caminho...");
		}
		
		System.out.println();
	}
	
	

}
