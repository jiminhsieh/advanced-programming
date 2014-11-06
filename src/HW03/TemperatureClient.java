import java.util.Scanner;

public class TemperatureClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Temperature temp = new Temperature();
		
		System.out.println(temp.TranslateTemp(input));
	}

}
