import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    	private static Scanner input;
	public static void main(String[] args){
        input = new Scanner(System.in);
        Matrix weightMatrix = new Matrix(dimension);
        weightMatrix.scanMatrix();
        weightMatrix.printMatrix();
        KarpAlgorithm kA = new KarpAlgorithm(weightMatrix);
        System.out.println("The eigenvalue of the matrix is: " + kA.getEigenvalue(weightMatrix));
        
	}
}
