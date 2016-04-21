<<<<<<< HEAD:src/Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        int dimension = input.nextInt(); // dimension of the matrix we want to check
        System.out.println("Enter upper values of the matrix");
       /* AdjacencyMatrix  upperValueMatrix = new AdjacencyMatrix(dimension); // matrix created by biggest numbers in the interval matrix
        upperValueMatrix.scanMatrix();	
        upperValueMatrix.printMatrix();
        System.out.println("Enter lower values of the matrix");
        AdjacencyMatrix lowerValueMatrix = new AdjacencyMatrix(dimension); // matrix created by lowest number in the interval matrix.
        lowerValueMatrix.scanMatrix();
        lowerValueMatrix.printMatrix();*/
        Matrix wm = new Matrix(dimension);
        wm.scanMatrix();
        wm.printMatrix();
        KarpAlgorithm kA = new KarpAlgorithm(wm);
        System.out.println("The eigenvalue of the matrix is: " + kA.getEigenvalue(wm));
        
	}
}
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of the matrix");
        int dimension = input.nextInt(); // dimension of the matrix we want to check
        System.out.println("Enter upper values of the matrix");
       /* AdjacencyMatrix  upperValueMatrix = new AdjacencyMatrix(dimension); // matrix created by biggest numbers in the interval matrix
        upperValueMatrix.scanMatrix();	
        upperValueMatrix.printMatrix();
        System.out.println("Enter lower values of the matrix");
        AdjacencyMatrix lowerValueMatrix = new AdjacencyMatrix(dimension); // matrix created by lowest number in the interval matrix.
        lowerValueMatrix.scanMatrix();
        lowerValueMatrix.printMatrix();*/
        Matrix wm = new Matrix(dimension);
        wm.scanMatrix();
        wm.printMatrix();
        KarpAlgorithm kA = new KarpAlgorithm(wm);
        System.out.println("The firs cols:\n");
        System.out.println(kA.getCols(wm));
        System.out.println(kA.getEigenvalue(wm));
        
	}
}
>>>>>>> origin/master:MaxPlusAlgebra/src/Main.java
