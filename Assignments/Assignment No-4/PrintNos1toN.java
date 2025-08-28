import java.util.Scanner;

public class PrintNos1toN{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");
		n=sc.nextInt();

		for(int i=1;i<=n;i++)
			System.out.println(i);	
		
	}
}