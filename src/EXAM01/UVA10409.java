import java.util.ArrayList;
import java.util.Scanner;

public class UVA10409 {//Die Game
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a; ;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while((a=sc.nextInt())>0){
			int up=1, n=2, w=3, e=4, s=5, down=6, temp;
			while(a-->0){
				String st = sc.next();
				if(st.equals("north")){
					temp=up; up=s; s=down; down=n; n=temp;
				}
				if(st.equals("south")){
					temp=up; up=n; n=down; down=s; s=temp;
				}
				if(st.equals("east")){
					temp=up; up=w; w=down; down=e; e=temp;
				}
				if(st.equals("west")){
					temp=up; up=e; e=down; down=w; w=temp;
				}
			}
			arr.add(up);
		}
		for(int i=0; i<arr.size(); i++) System.out.println(arr.get(i));
	}
}
