import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node {
    public List<Node> filho = new ArrayList<Node>();
    public Node pai;
    public int[]mapa = new int [9];
    public int x = 0 ;
    public int coluna = 3 ;
    public int id;

    public Node (int[] temp ) {
        SetMapa(temp);    
    }
    
    

    public void SetMapa(int[] temp) {
        for(int i = 0 ; i < mapa.length ; i++)
            this.mapa[i] = temp[i];
    }

    public void gerarFilhos() {
        for(int i = 0; i < mapa.length ; i++){
            if( mapa[i] == 0) {
                x = i;
            }
        }

        moverDireita(mapa,x);
        moverEsquerda(mapa,x);
        moverCima(mapa,x);
        moverBaixo(mapa,x);

    }
    
    public List<Node> getFilhos()
    {
    	return filho;
    }
    public boolean Verifica() {

        boolean objetivo = true;
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
            filho.add(filho1);
            filho1.pai = this;
            System.out.println("cima");
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
            filho.add(filho1);
            filho1.pai = this;
            System.out.println("baixo");
        
        }
    }

    public void moverDireita(int[] temp , int i) {
        if(i <8) {
            int [] mapapai = new int [9];
            copiaMapa(mapapai,temp);
            
            int temp2 = mapapai[i+1];
            mapapai[i+1] = mapapai[i];
            mapapai[i]=temp2;

            Node filho1 = new Node(mapapai);
            filho.add(filho1);
            filho1.pai = this;
            System.out.println("direita");
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
            filho.add(filho1);
            filho1.pai = this;
            System.out.println("esquerda");
        }
    }

    public void copiaMapa(int[]x ,int[] y) {

        for(int i =0 ; i <y.length ;i++) {
            x[i]= y[i];
        }
    }

    public void PrintMapa() {

        for(int i = 0; i< mapa.length;i++) {
        	
        	System.out.print(mapa[i]);
        
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
}