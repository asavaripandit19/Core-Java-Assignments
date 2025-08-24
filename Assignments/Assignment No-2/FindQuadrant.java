import java.util.Scanner;
public class FindQuadrant{
	public static void main(String[] args){
		float x,y;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter X: ");
		x=sc.nextInt();
		System.out.print("Enter Y: ");
		y=sc.nextInt();
		
		if(y==0 && x==0)
			System.out.println("Points lies on Origin");
		else if(x==0)
			System.out.println("Points lies on y axis");
		else if(y==0)		
			System.out.println("Points lies on x axis");
		else if(x>0 && y>0)
			System.out.println("I Quadrant");
		else if(x<0 && y>0)
			System.out.println("II Quadrant");
		else if(x<0 && y<0)
			System.out.println("III Quadrant");
		else 
			System.out.println("IV Quadrant");
		




	}
}