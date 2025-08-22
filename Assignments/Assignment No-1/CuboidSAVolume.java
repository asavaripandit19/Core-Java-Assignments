import java.util.Scanner;
public class CuboidSAVolume{
	public static void main(String[] args){
		int l,h,b;
		float surfaceArea,Volume;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of Cuboid: ");
		l= sc.nextInt();
		System.out.print("Enter Breath of Cuboid: ");
		b= sc.nextInt();
		System.out.print("Enter height of Cuboid: ");
		h= sc.nextInt();

		surfaceArea = 2*((l*h)+(l*b)+(b*h));
		Volume = l*b*h;

		System.out.println("Surface area of Cuboid is: "+surfaceArea);
		System.out.println("Volume of Cuboid is: "+Volume);
	}
}