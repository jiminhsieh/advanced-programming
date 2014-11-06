import java.util.ArrayList;
import java.util.Scanner;

public class UVA10189 {//Minesweeper //Wrong answer
	static int n;
	static int m;
	static int[][] answer;
	static char[][] bob; 
	static Scanner sc;
	static int field=0;
	static ArrayList arr = new ArrayList();
	
	public static void main(String[] args){
		sc = new Scanner(System.in);
		while((n = sc.nextInt())>0 && (m = sc.nextInt())>0){
		   answer = new int[n][m];
		   bob = new char[n][m];
		   input();
		   field++;
		   process(); 
		}
		printAnswer();
	}
	
	private static void printAnswer() {
		for(int i=0; i<arr.size(); i++){
			String st = arr.get(i).toString();
			
			if(i>0 && st.toString().startsWith("F"))System.out.println();
			
			if(i!=arr.size()-1)	System.out.println(st);
			else System.out.println(st);
		}
	}

	public static void input(){
    	for(int i=0; i<n; i++){
    		bob[i]=(sc.next()).toCharArray();
    	}
	    	
	}
	
    public static void process(){
    	for(int i=0; i<n; i++){
    		for(int j=0; j<m; j++){
    			if (bob[i][j]=='*')		mineAddNeighborOne(i, j);
    		}
    	}
    	
     		arr.add("Field #"+(field)+":");
    		for(int j=0; j<n; j++){
    			String st ="";
    			for(int k=0; k<m; k++){
    				if(bob[j][k]=='*')  st = st+"*";
    				else st = st+answer[j][k];
    		    }
    			arr.add(st);
    		}
    }
    
    
    public static void mineAddNeighborOne(int i, int j){
		for(int row = i-1; row <= i+1; row++){
			for(int cul = j-1; cul <= j+1; cul++){
				if(row<0||row>=n||cul<0||cul>=m ) continue;
						answer[row][cul]++;
			}
		}
	}

}
