import java.util.Scanner;


public class DealNumberClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result, size;
		
		System.out.print("Please input your how much number you want to compare: ");
		Scanner source = new Scanner(System.in);
		size = source.nextInt();
		
		System.out.print("Please input your number: ");
		
		DealNumber number = new DealNumber();
		result = number.getLargest(source, size);
		System.out.print("Largest Number: " + result);

	}

}
