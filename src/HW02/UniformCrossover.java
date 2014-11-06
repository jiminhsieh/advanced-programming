import java.util.Scanner;
//Homework02
public class UniformCrossover {
	private int[][] Parent;
	private int[][] Child;
	
	public UniformCrossover() {
		this.Parent = new int[2][10];
		this.Child = new int[2][10];
	}
	
	public void setParentGeneric (Scanner input, int n) {
		for(int i = 0; i < this.Parent[n - 1].length; i++) {
			this.Parent[n-1][i] = input.nextInt();
		}
	}
	
	public int[] getChildGeneric (int childGeneric) {
		return this.Child[childGeneric-1];
	}
	
	public void crossover () {
		/*for(int i = 0; i < 2; i++) {
			for( int j = 0; j < this.Parent[i].length; j++) {
				if (i == 0 && j % 2 == 0)
					this.Child[i][j] = this.Parent[i][j];
				else if (i == 0 && j % 2 != 0)
					this.Child[i][j] = this.Parent[i + 1][j];
				else if (i == 1 && j % 2 == 0)
					this.Child[i][j] = this.Parent[i][j];
				else 
					this.Child[i][j] = this.Parent[i -1][j];
			}
		}*/
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				this.Child[0][i] = this.Parent[0][i];
				this.Child[1][i] = this.Parent[1][i];
			} else {
				this.Child[0][i] = this.Parent[1][i];
				this.Child[1][i] = this.Parent[0][i];			}
		}
		
	}

}
