import java.util.Scanner;
public class NumDivBy5and7Usingifelse{
	public static void main(String[] args){
		int num;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num=sc.nextInt();

		if(num%5==0 || num%7==0)
			System.out.print(num+ " is divisible by 5 either 7");
		else
			System.out.print(num+ " is not divisible by 5 either 7");
	}
}