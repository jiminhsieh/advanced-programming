import java.util.Scanner;

public class GradeSystemClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("How much class you have: ");
		Scanner source = new Scanner(System.in);
		int classnumber = source.nextInt();
		
		GradeSystem grade = new GradeSystem(classnumber);
	
		for (int i = 1; i <= classnumber; i++) {
			System.out.print("How much student you have in " + i + " class: ");
			int eachClass = source.nextInt();
			
			System.out.print("Please give each student's score in " + i  + " class: ");
			grade.setScore(i, eachClass, source);	
		} 
		
		source.close();
		
		for(int i = 1; i <= classnumber; i++) {
			System.out.println("class " + i + "'s " + "average " + grade.getMean(i));
		}
	}
}
