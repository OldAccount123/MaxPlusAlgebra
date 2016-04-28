import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The Matrix class operates with square matrices.
 */

public class Matrix {

	private int[][] matrix;
	private int dimension;
	private Scanner input;

	/**
	 * Creates a (dimension x dimension) null-matrix as a 2D array.     
	 * @param int dimension - dimension of the matrix       
	 */
	public Matrix(int dimension) {
		this.setDimension(dimension);
		matrix = new int[dimension][dimension];
		for (int row = 0; row < dimension; row++) {
			for (int col = 0; col < dimension; col++) {
				matrix[row][col] = 0;
			}
		}
	}

	/**
	 * Returns the dimension of the matrix
	 * @return int - the dimension of the matrix.
	 */
	public int getDimension() {
		return this.dimension;

	}

	/**
	 * Scans a (dimension x dimension) matrix.
	 */
	public void scanMatrix() {
		input = new Scanner(System.in);
		int temp; // temporary value of scanned integer.
		for (int row = 0; row < getDimension(); row++) {
			for (int col = 0; col < getDimension(); col++) {
				temp = input.nextInt();
				setEdge(row, col, temp);
			}
		}
	}

	/**
	 * Sets the value of the edge between vertex1 and vertex2
	 * @param int vertex1
	 * @param int vertex2
	 * @param value - value to be set.
	 */
	public void setEdge(int vertex1, int vertex2, double value) {
		matrix[vertex1][vertex2] = (int) value;
	}

	/**
	 * Returns any needed value from the matrix
	 * @param1 vertex1
	 * @param2 vertex2
	 * @return double The weight of the edge between vertex1 and vertex2
	 */
	public double getValueOf(int vertex1, int vertex2) {
		return matrix[vertex1][vertex2];
	}
	
    /**
     * Gets the minimal number from a set of numbers
     * @param list - list of numbers to get the minimum value of
     * @return - returns the minimal value from the numbers
     */
    public double getMin(ArrayList<Double> list) {
   	 double min; //variable to save the minimal value to it
		 min = list.get(0);
   	 for(int i=1;i<list.size();i++){
   		 if (min > list.get(i)) {
   			 min = list.get(i);
   		 }
   	 }    
	 return min;
	 }
    
    /**
     * Gets the maximal number from a set of numbers 
     * @param list - list of numbers to get the maximum value of
     * @return - returns the maximal value from the numbers
     */
    public double getMax(ArrayList<Double> list) {
   	 double max; //variable to save the maximal value to it
		 max = list.get(0);
   	 for(int i=1;i<list.size();i++){
   		 if (max < list.get(i)) {
   			 max = list.get(i);
   		 }    		  	 	 
   	 }
	 return max;
	 }
	
	/**
     * Multiplies 2 matrices from the input
     * @param m1 - the matrix to be multiplied
     * @param2 m2 - the second matrix
     * @return Matrix  m1*m2
     */
     public Matrix mulMatrix(Matrix m1 , Matrix m2){
    	 int dim = m1.getDimension(); //the dimension of the adjacency matrix
<<<<<<< HEAD
    	 AdjacencyMatrix adjMatrix = new AdjacencyMatrix(dim);  //a matrix to save the powered matrix to it  	
=======
    	 Matrix matrix = new Matrix(dim);  //a matrix to save the powered matrix to it  
>>>>>>> refs/heads/pr/20
    	 //makes the row*column multiplications
    	 ArrayList<Double> list = new ArrayList<Double>();
    	 for (int i=0;i<dim;i++){
             for (int j=0;j<dim;j++){   
                for (int k=0;k<dim;k++){
                   list.add(m1.getValueOf(i, k)+m2.getValueOf(k, j));
                }  
                matrix.setEdge(i, j, getMax(list));
                list.clear();
             }
          }
		return matrix; 
     }


	/**
	 * Prints out the matrix as a 2D array.
	 */
	public void printMatrix() {
		for (int[] row : matrix) {
			System.out.print("\t");
			System.out.println(Arrays.toString(row));
		}
	}

	private void setDimension(int dimension) {
		this.dimension = dimension;
	}

}
