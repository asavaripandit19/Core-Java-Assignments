import java.util.Scanner;
public class NumDivBy5and7UsingOperator{
	public static void main(String[] args){
		int num;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = sc.nextInt();

		if(num%5==0 && num%7==0)
			System.out.print(num+ " is Divisible by both 5 and 7");
		else
			System.out.print(num+ " is not Divisible by both 5 and 7");

	}
}