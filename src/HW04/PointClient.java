import java.util.Scanner;
public class PointClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input coordinate of P:");
		Point p = new Point(sc.nextDouble(), sc.nextDouble());
		System.out.print("Please input coordinate of Q:");
		Point q = new Point(sc.nextDouble(), sc.nextDouble());
		
		System.out.println("The distance of P and Q:"+ p.distance(q) );

	}

}
