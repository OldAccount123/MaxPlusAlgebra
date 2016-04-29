import java.util.ArrayList;
 
public class KarpAlgorithm {
    private Matrix matrix;
    private int dim;
    public KarpAlgorithm(Matrix matrix){
        this.matrix = matrix;
        dim = matrix.getDimension();
    }
    /**
     * This function returns a list of first columns of the matrix A, A^2, A^3, ... A^dim-1;
     * returns nested list of a first columns of a digraph.
     */
    public ArrayList<ArrayList<Double>> getCols(){
        // a nested list to save the first columns of the powered matrices
    	ArrayList<ArrayList<Double>> listOfCols = new ArrayList<ArrayList<Double>>();  
        for(int i=0;i<=dim;i++){
    		listOfCols.add(new ArrayList<Double>());
        	for(int j=0;j<dim;j++){
        		listOfCols.get(i).add((double) multiplyMatrix().get(i).getValueOf(j, 0));
        	}
        }        
        return listOfCols;
    }
     /**
      * Takes a matrix from the input, creates a list of matrices and adds the powered matrices to it.
      * @return ArrayList<Matrix> listOfMatrices - returns the list of matrices A, A^2, A^3, ... A^dim+1;
      */
     public ArrayList<Matrix> multiplyMatrix(){
    	ArrayList<Matrix> listOfMatrices = new ArrayList<Matrix>(); //the list to save the powered matrices 
    	listOfMatrices.add(matrix);
    	Matrix temp = new Matrix(dim);
    	//temporary matrix to save the A, A^2, A^3, ... A^dim matrices to it;
    	//takes the temp matrix and adds a new matrix-the powered temp matrix to the list
		temp = temp.mulMatrix(matrix, matrix);
    	for(int i=0;i<dim+1;i++){    		
    		listOfMatrices.add(temp);
    		temp = temp.mulMatrix(temp, matrix);
    	}
		return listOfMatrices;    	 
     }
     /**
      * Don't know if it is needed
      * Saves all the cycles of lengths 1,2,..,dim
      * (calls the method multiplyMatrix which returns all the powered matrices and takes the diagonal values of it)
      */
     public ArrayList<ArrayList<Double>> getCriticalCycles(){
    	 ArrayList<ArrayList<Double>> cycles = new ArrayList<ArrayList<Double>>(); // list to save all the critical cycles  
    	 for(int i=0;i<dim;i++){
    		 cycles.add(new ArrayList<Double>());
    		 for(int j=0;j<dim;j++){
	    		 cycles.get(i).add(multiplyMatrix().get(i).getValueOf(j, j));
	    	 }
    	 }
    	 return cycles;    	 
     }
     /**
      * Calculates the eigenvalue of the matrix via column principle 
      * @return - returns the eigenvalue of the input-matrix
      */
     public double getEigenvalue(){
    	 ArrayList<Double> listOfMins = new ArrayList<Double>(); //list to save the minimum values 
    	 // temporary list to save the values to get the minimum of
    	 ArrayList<Double> temp = new ArrayList<Double>(); 
    	 //adds the needed values(column principle) to the list to get the max of them 
    	 for(int i=0;i<dim;i++){
    		 temp.clear(); 
			 int k = dim;    		 
    		 for(int j=0;j<dim;j++){
				 temp.add((getCols().get(dim).get(i) - getCols().get(j).get(i)) / (k));  
				 k--;
    		 }
    		 listOfMins.add(matrix.getMin(temp));    		 
    	 } 	    	 
		 return matrix.getMax(listOfMins);    	 
     }
}
