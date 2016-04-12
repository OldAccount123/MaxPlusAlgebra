import java.util.Scanner;

public class Main {
	AdjacencyMatrix  adjacency;
	
    public static void main(String[] args){
    	int dimension;
    	
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix: ");
        AdjacencyMatrix  adjacency = new AdjacencyMatrix(dimension = input.nextInt());
	adjacency.scanMatrix();	
	}
}
