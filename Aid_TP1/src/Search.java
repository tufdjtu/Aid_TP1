import java.util.*;

public class Search {

	
	public Search() {
		
	}
	
	public Queue <Node> FirstSearch (Node root){
		
		Queue <Node> CaminhoSolucao = new LinkedList<Node>();
		Queue <Node> OpenList = new LinkedList <Node>();
		Queue <Node> ClosedList = new LinkedList <Node>();
		
		OpenList.add(root);
		boolean  objetFound = false;
		
		while(OpenList.size() > 0 && !objetFound) {
			
			Node atualNode = OpenList[0];
			ClosedList.add(atualNode);
			OpenList.remove(0);
			
			
		    atualNode.PossiMovimento();
		    
		    for(int i = 0; i< atualNode.filho.size();i++) {
		    	
		    	Node currentChild = atualNode.filho[i];
		    	if(currentChild.Verifica()) {
		    		
		    		System.out.println("objetivo encontrado");
		    		objetFound = true;
		    		
		    		PathTrace(CaminhoSolucao,currentChild);
		    	}
		    	
		    	if(!Contains(OpenList,currentChild) && !Contains(ClosedList,currentChild)) {
		    	OpenList.add(currentChild);
		    	}
		    	
		    }
			
			
		}
		
		return CaminhoSolucao;
	}
	
	public void PathTrace(Queue<Node> path , Node n) {
		System.out.println("Encontrar o caminho...");
		Node current = n;
		path.add(current);
		
		
		while(current.pai!=null)
		{
			current = current.pai;
			path.add(current);
		}
		
	}
	
	
	
	
	
	public static boolean Contains(Queue<Node> queue , Node c)
	{
		boolean contains = false;
		
		for (int i=0; i<queue.size();i++ ) {
			
			if(queue[i].MapaRepetido(c.mapa))
				
				contains= true;
		}
	}
}
