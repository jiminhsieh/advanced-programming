import java.util.Scanner;

public class BallHeightClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height;
		int times;
		Scanner source = new Scanner(System.in);
		try {
			System.out.print("Please let me know how hight you drop the ball:");
			height = source.nextDouble();
			System.out.print("Please let me know you want to know which time's height:");
			times = source.nextInt();
		} finally {
			source.close();
		}
		
		
		BallHeight ballHeight = new BallHeight();
		
		System.out.print("Your Result: " + ballHeight.GetHight(height, times));

	}
}
