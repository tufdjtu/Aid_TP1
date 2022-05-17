import java.util.ArrayList;

public class Node {
	
	private String puzzle ;
	
	private Node parent;
	
	private int pecabranca;
	
	public Node(String puzzle) {
		
		this.puzzle=puzzle;
		this.parent=null;
		this.findPecabranca();		
	}
	
	public void setParent(Node parent) {
		
		this.parent= parent;
		
	}
	
	public Node getParent() {
		 
		return this.parent;
	}
	
	public String getPuzzle() {
		 
		return this.puzzle;
	}
	
	private void findPecabranca()
	{
		
		this.pecabranca = this.puzzle.indexOf("0");
		
	}
	
	public int getPecabranca(){
		
		return this.pecabranca;
	}
	
	public String Troca(int otherposi) {
		
		char [] charArray;
		charArray = this.puzzle.toCharArray();
		charArray[this.getPecabranca()] = charArray[otherposi] ;
		charArray[otherposi] = '0';
		
		return new String(charArray);
	}
	
	public ArrayList <Node> ordenarPuzzle() {
		
		ArrayList <Node> fotografias =new ArrayList<>();
		switch(this.getPecabranca()) {
		
		case 0 :
			fotografias.add(new Node(this.Troca(this.getPecabranca()+3))) ;
			fotografias.add( new Node(this.Troca(this.getPecabranca()+1)));
			break;
			
		case 1 :
			fotografias.add(new Node(this.Troca(this.getPecabranca()-1)));
			fotografias.add(new Node(this.Troca(this.getPecabranca()+1)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()+3)));
			break;
		case 2 :
			fotografias.add( new Node(this.Troca(this.getPecabranca()-1)));
			fotografias.add(new Node(this.Troca(this.getPecabranca()+3)));
			break;
		case 3 :
			fotografias.add(new Node(this.Troca(this.getPecabranca()+1)));
			fotografias.add(new Node(this.Troca(this.getPecabranca()-3)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()+3)));
			break;
		case 4 :
			fotografias.add( new Node(this.Troca(this.getPecabranca()+1)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()-3)));
			fotografias.add(new Node(this.Troca(this.getPecabranca()+3)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()-1)));
			break;
		case 5 :
			fotografias.add( new Node(this.Troca(this.getPecabranca()-3)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()+3)));
			fotografias.add(new Node(this.Troca(this.getPecabranca()-1)));
			break;
		case 6 :
			fotografias.add(new Node(this.Troca(this.getPecabranca()-3)));
			fotografias.add(new Node(this.Troca(this.getPecabranca()+1)));
			break;
		case 7 :
			fotografias.add( new Node(this.Troca(this.getPecabranca()+1)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()-3)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()-1)));
			break;
		case 8 :
			fotografias.add( new Node(this.Troca(this.getPecabranca()-3)));
			fotografias.add( new Node(this.Troca(this.getPecabranca()-1)));
			break;
			
		} 
		return fotografias;
		
	}

	public void printPuzzle(){
		
		char [] charArray = this.puzzle.toCharArray();	
		
		
		for(int i=0 ; i<9; i++) {
			if(i % 3 == 0 )
			System.out.println();
			System.out.print(charArray[i]);
		}
	}
}
