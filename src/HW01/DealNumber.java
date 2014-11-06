import java.util.Scanner;

public class DealNumber {
	
	public int getLargest(Scanner source, int size) {
		int result = source.nextInt();
		int number; 
		
		for (int n = 0; n < size - 1 ; n++) {
			number = source.nextInt();
			if (number > result ) result = number;
		}
		
		return result;
	}
	
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