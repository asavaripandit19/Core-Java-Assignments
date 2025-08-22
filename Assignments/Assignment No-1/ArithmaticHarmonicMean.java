import java.util.Scanner;
public class ArithmaticHarmonicMean{

	public static void main(String[] args){
		int a,b;
		float AM,HM;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a: ");
		a = sc.nextInt();

		System.out.println("Enter b: ");
		b = sc.nextInt();

		AM = (a+b)/2;
		HM = (2*a*b)/(a+b);

		System.out.println("Arithmatic Mean: "+AM);
		System.out.println("Harmonic Mean: "+HM);
	}
}
	