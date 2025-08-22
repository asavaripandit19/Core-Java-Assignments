import java.util.Scanner;
	public class TempFahrenheitCelsiusKelvin{

	public static void main(String[] args){
	
	float f;
	double k,c;

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Temperature in Fahrenheit: ");
	f = sc.nextFloat();
	
	c = (5.0/9)*(f-32);
	k= c+273.15;

	System.out.println("Temperature in Celsius : "+c);
	System.out.print("Temerature in Kelvin: "+k);

	}

	
}