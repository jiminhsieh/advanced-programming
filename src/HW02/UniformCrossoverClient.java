import java.util.Scanner;

public class UniformCrossoverClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		UniformCrossover sequence = new UniformCrossover(); 
		
		for (int i = 1; i <= 2; i++) {
			System.out.print("Please input Sequence of Parent " + i +": ");
			sequence.setParentGeneric(input, i);
		}
		
		sequence.crossover();
		
		for (int i = 1; i <= 2; i++) {
			int[] sequenceArray = sequence.getChildGeneric(i);
			System.out.print("Sequence of Child " + i + ": ");
			for(int eachGeneric:sequenceArray) {
				System.out.print(eachGeneric + " ");
			}
			System.out.print("\n");
		}

	}

}
