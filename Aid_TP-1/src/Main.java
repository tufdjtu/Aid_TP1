import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Node NodeInicial = new Node(scanner.nextLine());
		Node NodeFinal = new Node(scanner.nextLine());
			
		Search search = new Search(NodeInicial,NodeFinal);		
	}

}
