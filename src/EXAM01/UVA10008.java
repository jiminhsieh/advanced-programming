import java.util.Scanner;

public class UVA10008 {
	
	public static void main(String[] args) {
		int[] count= new int[256]; 
		Scanner sc = new Scanner(System.in);
		int len=0;
		int line = sc.nextInt();
		
		while((line--)>=0){
			String st = sc.nextLine().toUpperCase();
			char[] charArray = st.toCharArray();
			
			for (int i=0; i<charArray.length; i++){
				len++;
				count[charArray[i]]++;
				   
			}
		}
		
		while((len--)>0){
			for(char c = 'A'; c<='Z'; c++){
				if(count[c]==len && count[c]>0) System.out.println(c+" "+count[c]);
			}
		
	    }
		sc.close();
    }
}
