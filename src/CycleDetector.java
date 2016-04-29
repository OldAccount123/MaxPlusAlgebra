import java.util.ArrayList;

/**
 * Class to work with cycles,finds critical cycles,etc.
 * NOT READY
 *
 */

public class CycleDetector {
	private boolean[] marked;
	private boolean[] done;
	private boolean dagflag;
	private Matrix matrix;
	private int dim;
	/**
	 * function isn't ready, but it should find all the cycles in the digraph 
	 * @param matrix
	 */
	public CycleDetector(Matrix matrix){
		dim = matrix.getDimension();
		this.matrix = matrix;
		marked = new boolean[dim];
		done = new boolean[dim];
		for(int v=0;v<dim;v++){
			if(!marked[v]){
				dagflag = search(matrix, v);
			}
		}
	}
	public boolean search(Matrix matrix, int v){
		marked[v] = true;
		for(int w=0;w<dim;w++){
			if(matrix.getValueOf(v, w) != 0){
				if(!marked[w]){
					return search(matrix, w);
				}
			}
			done[v] = true;
		}
		return true;
	}
	/**
	 * Saves and returns a list of all cycles in the digraph
	 * @return list of all cycles of the digraph
	 */
	public ArrayList<ArrayList<Double>> getCycles(){
		ArrayList<ArrayList<Double>> cycles = new ArrayList<ArrayList<Double>>();
		for(int v=0;v<dim;v++){
			if(search(matrix, v)){
				
			}
		}
		return cycles;
	}
	/**
	 * Finds the critical cycle/s of the graph by comparing the cycles average weight to the eigenvalue
	 * @return list containing all the critical cycles of the digraph
	 */
    public ArrayList<ArrayList<Double>> findCriticalCycle(){
        KarpAlgorithm karp = new KarpAlgorithm(matrix); //reference 
        double eigenValue = karp.getEigenvalue(); // the eigenvalue of the amtrix
        ArrayList<ArrayList<Double>> cycles = new ArrayList<ArrayList<Double>>();
        ArrayList<ArrayList<Double>> criticalCycles = new ArrayList<ArrayList<Double>>(); // list to save the critical cycle/s
        cycles = getCycles(); //saves the list of all cycles
        for(int i = 0; i <= cycles.size(); i++){
        	//if the average weight of the cycle equals the eigenvalue, save as a critical cycle
            if(cycles.get(i).stream().mapToDouble(value -> value).sum()/cycles.get(i).size() == eigenValue){
                criticalCycles.add(cycles.get(i)); 
            }
        }
        return criticalCycles;
    }
}
