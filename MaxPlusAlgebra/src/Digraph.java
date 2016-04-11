import java.util.Scanner;

public class Digraph {
	private int[][] digraph; // adjacency matrix
	private int dimension;
	public Digraph(int dimension){
		this.dimension = dimension;
		digraph = new int[dimension][dimension];
		for(int row = 0; row < dimension; row++){
			for(int col = 0; col < dimension; col++){
				digraph[row][col] = 0;
			}
		}
	}
	
	/**
	 * Creates matrix of dim dimension, values are 0/1
	 */
	
	public void scanMatrix(){
		Scanner input = new Scanner(System.in);
		int temp; // temporary value of scanned integer.
		for(int row = 0; row < dimension; row++) {
			for(int col = 0; col < dimension; col++){
	            temp = input.nextInt();
	            while(temp != 0 && temp != 1){ // only ones and zeros are allowed in the adjacency matrix.
	            	System.out.println("Please enter a valid value");
	            	temp = input.nextInt();
	            }
	            addEdge(row,col,temp);
			}	
		}
	}
	
	/**
	 * Adds edge of weight weight between vertex1 and vertex2 to digraph
	 * @param int vertex1
	 * @param int vertex2
	 * @param weight - weight of the edge.
	 */
	public void addEdge(int vertex1, int vertex2, int weight){
		if(weight != 0){
			digraph[vertex1][vertex2] = 1;
		}
		else{
			System.out.println("There is already edge between those 2 vertexes!");
		}
	}
	/**
	 * Removes the edge between vertex1, vertex2 
	 * @param int vertex1 - represents first vertex
	 * @param int vertex2 - represents second vertex
	 */
	public void removeEdge(int vertex1, int vertex2){
		if(digraph[vertex1][vertex2] == 1){
			digraph[vertex1][vertex2] = 0;
		}
		else{
			System.out.println("There is not any edge between those 2 vertexes");
		}
	}
}
