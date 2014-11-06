import java.util.Arrays;

public class Chromosome {
	
	private int[] gene;
	
	public Chromosome(int[] gene) {
		this.gene = gene;
	}
	
	public int[] getGene() {
		return gene;
	}
	
	public Chromosome onePointMutation() {
		int point = (int) (Math.random() * gene.length);
		int[] newGene = Arrays.copyOf(gene, gene.length);
		
		newGene[point] = (gene[point] == 0) ? 1:0;
		return new Chromosome(newGene);
		
	}

}
