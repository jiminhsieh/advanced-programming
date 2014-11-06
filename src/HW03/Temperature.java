import java.util.Scanner;

public class Temperature {
	private double Fahrenheit;
	private double Celsius;
	
	public Double TranslateTemp(Scanner input) {
		System.out.print("1: Fahrenheit to Celsius\n2: Celsius to Fahrenheit\nPlease input what your choice:");
		int choice = input.nextInt();
		
		switch(choice) {
			case 1:
				System.out.print("Please input Fahrenheit Temperature:");
				return FtoC(input.nextInt());
				
			case 2:
				System.out.print("Please input Ceslius Temperature:");
				return CtoF(input.nextInt());
			default:
				System.out.println("We don't have this option.");
				return null;
		}
		
	}
	
	private double FtoC(double Temp) {
		Celsius = (Temp - 32) * 5 / 9.0;
		return Celsius;
	}
	
	private double CtoF(double Temp) {
		Fahrenheit = Temp *(9 / 5.0) + 32;
		return Fahrenheit;
	}
	
}
