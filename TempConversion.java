import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {
		//method for item attributes used for add item switch statements. 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in Fahrenheit: ");
		double fahrenheit = input.nextDouble();
		System.out.print("Enter a temperature in Celcius: ");
		double celcius = input.nextDouble();
		if (celcius * 9/5 + 32 > fahrenheit ) {
			System.out.print("celcius is hotter than fahrenheit");
		} else {
			System.out.print("fahrenheit is hotter than celcius");
		}	
	}

}
