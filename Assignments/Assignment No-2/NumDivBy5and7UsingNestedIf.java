import java.util.Scanner;
public class NumDivBy5and7UsingNestedIf{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();

		if(num%7==0 && num%5==0)
			System.out.print(num+" is divisible by both 5 and 7 ");
		else if(num%7==0)
			System.out.print(num+" is divisible by 7");
		else if(num%5==0)
			System.out.print(num+" is divisible by 5");
		else
			System.out.print(num+" is not divisible by both 5 and 7 ");

	}
}