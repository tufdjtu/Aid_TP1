
import java.util.*;

public class Untilted {

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
			
			solution.reverse();
			
			for(int i = 0 ;i< solution.size();i++) 
				solution[i].CopiaMapa();
			
		}
		else {
			System.out.println("Nao exit caminho...");
		}
		
		System.out.println();
	}
	
	

}
