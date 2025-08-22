import java.util.Scanner;
public class DistanceBtwPonits{
	public static void main(String[] args){
		float x1,x2,y1,y2;
		double distance;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		x1=sc.nextFloat();
		System.out.println("Enter x2: ");
		x2=sc.nextFloat();
		System.out.println("Enter y1: ");
		y1=sc.nextFloat();
		System.out.println("Enter y2: ");
		y2=sc.nextFloat();

		distance = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));

		System.out.println("Distance Between Ponits: "+distance);
		

		
	}
	
}