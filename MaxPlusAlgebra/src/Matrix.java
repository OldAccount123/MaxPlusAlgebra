import java.util.Arrays;
import java.util.Scanner;

/**
 * The Matrix class operates with square matrices.
 * @author metti
 *
 */


public class Matrix {
	
	private int[][] matrix; 
	protected int dimension; 
	
	/**
	 * Creates a (dimension x dimension) null-matrix as a 2D array.
	 * @param int[][] matrix - null-matrix of dimension dimension
	 * @param int dimension - dimension of the matrix
	 */
	public Matrix(int dimension){
		this.dimension = dimension;
        matrix = new int[dimension][dimension];
        for(int row = 0; row < dimension; row++){
            for(int col = 0; col < dimension; col++){
                matrix[row][col] = 0;
            }
        }
    }
	
	/**
	 * @return int Returns the dimension of the matrix.
	 */	
    public int getDimension(){
    	return this.dimension;
    
	}
    
    /**
     * Scans a (dimension x dimension) matrix.
     * @param int row represents the rows of the matrix
 	 * @param int col represents the columns of the matrix
     */
    public void scanMatrix(){
    	System.out.println("Enter the " + dimension + " x " + dimension + " adjucency matrix:");
		Scanner input = new Scanner(System.in);		
		int temp; // temporary value of scanned integer.
		for(int row = 0; row < dimension; row++) {
			for(int col = 0; col < dimension; col++){
	            temp = input.nextInt();
	            while(temp != 0 && temp != 1){ // only ones and zeros are allowed in the adjacency matrix.
	            	System.out.println("Please enter a valid value");
	            	temp = input.nextInt();
	            }
	            setEdge(row,col,temp);
			}	
		}
	}
    /**
     * Sets the value of the edge between vertex1 and vertex2
     * @param int vertex1
     * @param int vertex2
     * @param value - value to be set.
     */
    public void setEdge(int vertex1, int vertex2, int value){
	        matrix[vertex1][vertex2] = value;
	}
	
    /**
     * Returns any needed value from the matrix
     * @param1 vertex1 
     * @param2 vertex2
	 * @return int The value of the dge between vertex1 and vertex2
     */
	public int getValueOf(int vertex1, int vertex2){
		return matrix[vertex1][vertex2];
	}
	
	/**
	 * Prints out the matrix as a 2D array.
	 */
	public void printMatrix(){
		for(int[] row : matrix){
			System.out.print("\t");
	        System.out.println(Arrays.toString(row));
		}
	}

}
