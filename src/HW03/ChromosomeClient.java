import java.util.Scanner;

public class ChromosomeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] gene = new int[10];
		System.out.print("Please input Parent's Gene:");
		
		for(int i = 0; i < gene.length; i++) {
			gene[i] = input.nextInt();
		}
		
		Chromosome parent = new Chromosome(gene);
		Chromosome child = parent.onePointMutation();
		
		System.out.print("Child Gene:");
		
		for(int i:child.getGene()) {
			System.out.print(i + " ");
		}		

	}

}
