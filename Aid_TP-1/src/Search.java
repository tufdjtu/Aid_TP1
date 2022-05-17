import java.io.*;
import java.util.*;

public class Search {
	
	Stack<Node> Caminho =  new Stack <Node>();
	Queue<Node> nodes = new LinkedList <Node>() ;
	Queue<String> Visited = new LinkedList <String>();
	
	public Search(Node Nodeinicial , Node Nodefinal) {
		
		Node Nodeatual = new Node(Nodeinicial.getPuzzle());
		
		while( !Nodeatual.getPuzzle().equals(Nodefinal.getPuzzle()) ) {
			
			ArrayList <Node> filhos = Nodeatual.ordenarPuzzle();
			
			Visited.add(Nodeatual.getPuzzle());
			
			for(Node node : filhos) {
				
				if(!Visited.contains(node.getPuzzle())) {
					
					node.setParent(Nodeatual);
					nodes.add(node);
					
				}
					
			}
			
			Nodeatual= nodes.poll();
			
		}
		
		Caminho.push(Nodeatual);
		while(!Nodeatual.getPuzzle().equals(Nodeinicial.getPuzzle())) {
			Caminho.push(Nodeatual.getParent());
			Nodeatual = Nodeatual.getParent();
		}
		
		System.out.println(Caminho.size()-1);
		
		while(!Caminho.empty()) {
			Caminho.pop().printPuzzle();
			System.out.println();
		}
	}

	
}

