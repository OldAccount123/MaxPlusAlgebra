import java.util.ArrayList;
import java.util.List;
 
public class KarpAlgorithm {
    private Matrix matrix;
   
    public KarpAlgorithm(Matrix matrix){
        this.matrix = matrix;
    }
   
    /**
     * This function returns nested list of first columns of the matrix A, A^2, A^3, ... A^dim-1;
     * @param adjMatrix - adjacency matrix of a digraph.
     * returns nested list of a first columns of a digraph.
     */
    public ArrayList<ArrayList<Double>> getCols(Matrix adjMatrix){
        // a nested list to save the first columns of the powered matrices
    	ArrayList<ArrayList<Double>> listOfCols = new ArrayList<ArrayList<Double>>();     
    	int dim = adjMatrix.getDimension(); // the dimension of the adjacency matrix
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
    	int dim = matrix.getDimension();    	//the dimension of the adjacency matrix
    	ArrayList<Matrix> listOfMatrices = new ArrayList(); //the list to save the powered matrices 
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
      * Gets the minimal number from a set of numbers
      * @param list - list of numbers to get the minimum value of
      * @return - returns the minimal value from the numbers
      */
     public double getMin(ArrayList<Double> list) {
    	 double min;
		 min = list.get(0);
    	 for(int i=0;i<list.size()-1;i++){
    		 if (min > list.get(i+1)) {
    			 min = list.get(i+1);
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
    	 double max;
		 max = list.get(0);
    	 for(int i=0;i<list.size()-1;i++){
    		 if (max < list.get(i+1)) {
    			 max = list.get(i+1);
    		 }    		 
    	 }    	 	 
 		return max;
 	 }
     
     /**
      * Calculates the eigenvalue of the matrix via column principle 
      * @param matrix - the matrix to get the eigenvalue of 
      * @return - returns the eigenvalue of the input-matrix
      */
     public double getEigenvalue(Matrix matrix){
    	 int dim = matrix.getDimension();    //the dimension of the adjacency matrix
    	 ArrayList<Double> listOfMins = new ArrayList<Double>(); //list to save the minimum values 
    	 // temporary list to save the values to get the minimum of
    	 ArrayList<Double> temp = new ArrayList<Double>(); 
    	 //adds the needed values(column principle) to the list to get the max of them   
    	 System.out.println("the minimum values:\n");
    	 for(int i=0;i<dim;i++){
    		 temp.clear();    		 
    		 for(int j=0;j<dim;j++){
    			 int k = dim; 
				 temp.add((getCols(matrix).get(dim).get(i) - getCols(matrix).get(j).get(i)) / (k));  
				 k--;
    		 }
    		 listOfMins.add(getMin(temp));
    		 System.out.println(getMin(temp));
    		 
    	 }System.out.println("the eigenvalue:");    	    	 
		 return getMax(listOfMins);
    	 
     }

    
}