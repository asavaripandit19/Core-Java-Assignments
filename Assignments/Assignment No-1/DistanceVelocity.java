import java.util.Scanner;

public class DistanceVelocity{
	public static void main(String[] args){
	
	float u,a,t;
	double distance,velocity;

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter initial velocity :  ");
	u= sc.nextFloat();

	System.out.print("Enter accerlation :  ");
	a= sc.nextFloat();

	System.out.print("Enter Time :  ");
	t= sc.nextFloat();

	velocity= u+a*t;
	distance=u*t+(1*a*t*t)/2;

	System.out.println("Final Velocity: "+velocity);
	System.out.println("Distance: "+distance);

	}
}