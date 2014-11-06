import java.util.Scanner;

public class CircleClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Input A's coordinate of center of circle and radius:");
		Circle c = new Circle(new Point(sc.nextDouble(), sc.nextDouble()), sc.nextDouble());
		System.out.print("Please Input B's coordinate of center of circle and radius:");
		Circle d = new Circle(new Point(sc.nextDouble(), sc.nextDouble()), sc.nextDouble());
		
		if( c.isCollision(d) ){
			System.out.println("Collision!!!");
		}
		else{
			System.out.println("No Collision!!!");
		}
		

	}

}
