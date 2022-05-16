
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		 int [] mapa ={0,2,4,5,1,7,8,3,6};
			 
		 int [] mapa2 ={1,2,3,4,0,5,6,7,8};
			 
			 
		
		 
		 
		 
		Node Nodeinicial = new Node(mapa);
		Node Nodefinal = new Node(mapa2);
		Search search = new Search();
		System.out.println(search.FirstSearch(Nodeinicial,Nodefinal));
		
		
		
	}
}
		
		
		 
		