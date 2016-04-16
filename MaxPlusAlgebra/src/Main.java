import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        int dimension = input.nextInt(); // dimension of the matrix we want to check
        System.out.println("Enter upper values of the matrix");
        AdjacencyMatrix  upperValueMatrix = new AdjacencyMatrix(dimension); // matrix created by biggest numbers in the interval matrix
        upperValueMatrix.scanMatrix();	
        upperValueMatrix.printMatrix();
        System.out.println("Enter lower values of the matrix");
        AdjacencyMatrix lowerValueMatrix = new AdjacencyMatrix(dimension); // matrix created by lowest number in the interval matrix.
        lowerValueMatrix.scanMatrix();
        lowerValueMatrix.printMatrix();
	}
}
