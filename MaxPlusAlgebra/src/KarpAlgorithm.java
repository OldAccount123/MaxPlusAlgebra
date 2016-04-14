import java.util.ArrayList;
import java.util.List;

public class KarpAlgorithm {
	private AdjacencyMatrix matrix;
	
	public void KarpAlgorithm(AdjacencyMatrix matrix){
		this.matrix = matrix;
	}
	
	/**
	 * This function finds mean cycle weight of a digraph
	 * @param ArrayList<ArrayList<Integer>> cols - nested list of a first columns of a digraph.
	 * returns EigenValue.
	 */
	public void findAverageCycleWeight(AdjacencyMatrix adjMatrix){
		
	}
	/**
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
      	* @param1 dim - the dimension of the adjacency matrix
      	* @param2 listOfMatrices - the list to save the powered matrices 
      	* @param3 temp - temporary matrix to save the 
      	* @return ArrayList<Matrix> listOfMatrices - returns the list of matrices A, A^2, A^3, ... A^dim-1;
      	*/
     	public ArrayList<Matrix> multiplyMatrix(){
    		int dim = matrix.getDimension();    	
    		ArrayList<Matrix> listOfMatrices = new ArrayList();
    		listOfMatrices.add(matrix);
    		Matrix temp = new Matrix(dim);
    		temp = matrix;
    		for(int i=0;i<dim+1;i++){
    			temp = temp.squareMatrix(temp);
    			listOfMatrices.add(new Matrix(dim).squareMatrix(temp));    		
    		}
		return listOfMatrices;
     	}
	
}
