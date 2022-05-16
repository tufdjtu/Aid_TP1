import java.util.*;

public class Search {

	
	public Search() {
		
	}
	
	public Boolean FirstSearch (Node root,Node nodeFinal){
		
	    Stack <Node> CaminhoSolucao = new Stack<Node>();
		Queue <Node> OpenList = new LinkedList <Node>();
		Queue <Node> ClosedList = new LinkedList <Node>();
		
		OpenList.add(root);
		boolean  objetFound = false;
		
		while(OpenList.size() > 0 && !objetFound) {
			
			Node atualNode = OpenList.poll();
			ClosedList.add(atualNode);
		    atualNode.gerarFilhos();
			
		    for(int i = 0; i< atualNode.filho.size();i++) {
		    	
		    	Node currentChild = atualNode.getFilhos().get(i);
		    	if(isEqual1(atualNode,nodeFinal)) {
		    		objetFound = true;
		    		System.out.println("objetivo encontrado");
		    		return objetFound;
		    		//PathTrace(CaminhoSolucao,currentChild);
		    	}
		    	atualNode.PrintMapa();
		    	System.out.println();
		    	if(!OpenList.contains(currentChild) && !ClosedList.contains(currentChild)) {
		    	OpenList.add(currentChild);
		    	}
		    	//System.out.println(currentChild);
		    	
		    }
			
			
		}
		
		return objetFound;
	}
	
	/*public void PathTrace(Stack<Node> path , Node n) {
		System.out.println("Encontrar o caminho...");
		Node current = n;
		path.add(current);
		
		
		while(current.pai!=null)
		{
			current = current.pai;
			path.add(current);
		}
		
	}*/
	
	
	private static boolean isEqual1(Node stringInicial ,Node stringFinal) {
		
		ArrayList<Boolean> isEqual= new ArrayList<Boolean>();
		
		for(int i=0 ; i<stringInicial.mapa.length ; i++) {
			
			if(stringInicial.mapa[i] == stringFinal.mapa[i]) {
				
				isEqual.add(true);
				
			}else{
				isEqual.add(false);
			}
		} return isEqual.contains(false)? false : true;

		
	}
}
