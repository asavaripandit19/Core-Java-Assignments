import java.util.Scanner;
public class HelloPrintNTimes{
	public static void main(String[] args){
		int n,i;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		n=sc.nextInt();

		for(i=0;i<n;i++)
			System.out.println("Hello Core Java!");

	}

} 