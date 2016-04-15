import java.util.ArrayList;
import java.util.List;

public class KarpAlgorithm {
	private AdjacencyMatrix matrix;
	
	public void KarpAlgorithm(AdjacencyMatrix matrix){
		this.matrix = matrix;
	}
	
	/*
	 * This function finds mean cycle weight of a digraph
	 * @param ArrayList<ArrayList<Integer>> cols - nested list of a first columns of a digraph.
	 * returns EigenValue.
	 */
	public void findAverageCycleWeight(AdjacencyMatrix adjMatrix){
		
	}
	/*
	 * This function returns nested list of first cols of the matrix A, A^1, A^2, A^3, ... A^dim-1;
	 * @param AdjacencyMatrix adjMatrix - adjacency matrix of a digraph.
	 * returns nested list of a first columns of a digraph.
	 */
	public ArrayList<ArrayList<Integer>> getCols(AdjacencyMatrix adjMatrix){
		ArrayList<ArrayList<Integer>> listOfCols = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> cols = new ArrayList<Integer>();
		for(int i = 0; i != adjMatrix.getDimension()+1;i++){
			
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
    		AdjacencyMatrix temp = new AdjacencyMatrix(dim);
    		temp = matrix;  //temporary matrix to save the A, A^2, A^3, ... A^dim matrices to it;
    		//takes the temp matrix and adds a new matrix-the powered temp matrix to the list
    		for(int i=0;i<dim+1;i++){
    			temp = temp.powerMatrix(temp);
    			listOfMatrices.add(new Matrix(dim).powerMatrix(temp));    		
    		}
		return listOfMatrices;
     	}

}
