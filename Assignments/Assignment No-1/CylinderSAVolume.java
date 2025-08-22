import java.util.Scanner;
public class CylinderSAVolume{
	public static void main(String[] args){

	float radius,height;
	double surfaceArea,volume;

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter radius of Cylinder: ");
	radius = sc.nextFloat();
	
	System.out.println("Enter height of Cylinder: ");
	height = sc.nextFloat();

	surfaceArea = ((2*Math.PI*r*r)+(2*Math.PI*r*h));
	volume = Math.PI*r*r*h;

	System.out.print("Surface Area of Cylinder: "+surfaceArea);
	System.out.print("Volume of Cylinder: "+volume);
  
	}
		
}