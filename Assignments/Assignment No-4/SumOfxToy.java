import java.util.Scanner;

public class SumOfxToy{
	public static void main(String[] args){
	int x,y,Sum=0,i;
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter X: ");
	x = sc.nextInt();
	System.out.println("Enter Y: ");
	y = sc.nextInt();

	for(i=x;i<=y;i++)
		Sum+=i;

	System.out.println("Sum of "+ x +" to "+ y +" is: "+Sum);


	
	}

}