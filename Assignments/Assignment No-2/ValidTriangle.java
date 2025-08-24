import java.util.Scanner;
public class ValidTriangle{
	public static void main(String[] args){
		int s1,s2,s3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first side: ");
		s1=sc.nextInt();
		System.out.println("Enter Second side: ");
		s2=sc.nextInt();
		System.out.println("Enter third side: ");
		s3=sc.nextInt();

		if(s1+s2>s3 && s3+s2>s1 && s3+s1>s2)
			System.out.println("Triangle is valid");
		else 
			System.out.println("Triangle is not valid");
			
	}
}