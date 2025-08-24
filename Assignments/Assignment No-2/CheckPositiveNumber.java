import java.util.Scanner;
public class CheckPositiveNumber{
	public static void main(String[] args){
		int Num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		Num=sc.nextInt();
		
		if(Num>0)
			System.out.println("Number is Positive: ");
		else
			System.out.println("Number is Not Positive: ");

			

	}
}