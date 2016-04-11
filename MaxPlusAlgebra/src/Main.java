import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the dimension of the matrix: ");
		int number, dimension = input.nextInt();
		Digraph digraph = new Digraph(dimension);
		for (int row = 0; row < dimension; row++) {
            for (int column = 0; column < dimension; column++){
                number = input.nextInt();
                if(number != 0){
                	
                }
            }
        }
	}
}
