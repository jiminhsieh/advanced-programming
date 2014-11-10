
import java.util.Scanner;

public class GradeSystem {
	
	private int[][] ScoreStorage;
	
	
	public GradeSystem(int NumberOfClass) {
		this.ScoreStorage = new int[NumberOfClass][];
	}
	
	public void setScore(int className, int size, Scanner input) {
		
		int eachClass[] = new int[size];
		
		for (int i = 0; i < size; i++) {	
			eachClass[i] = input.nextInt();
		}
		this.ScoreStorage[className-1] = eachClass;
	}
	
	public double getMean(int className) {
		double total = 0;
		for (int grades:this.ScoreStorage[className-1]) {
			total += grades;
		}
		return total/this.ScoreStorage[className-1].length;
	}

}
