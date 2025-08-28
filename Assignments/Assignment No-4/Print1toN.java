import java.util.Scanner;

public class Print1toN{
	public static void main(String args[]){
		int x,y,i;

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter X: ");
	x=sc.nextInt();

	System.out.println("Enter Y: ");
	y=sc.nextInt();

	
	for(i=x;i<=y;i++)
		System.out.println(i);

	}

}