import java.util.Scanner;
public class Max1NoAmong3{
	public static void main(String[] args){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		b=(a>b)?a:b;// first check condition then assign value to b
		b=(c>b)?c:b;

		System.out.println("Maximun no is: "+b);
	}
}