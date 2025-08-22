import java.util.Scanner;

public class CylinderVolumeSA {
    public static void main(String[] args) {

        double radius, height, surfaceArea, volume;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of Cylinder: ");
        radius = sc.nextDouble();

        System.out.println("Enter height of Cylinder: ");
        height = sc.nextDouble();

        surfaceArea = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
        System.out.println("Surface Area of Cylinder: " + surfaceArea);

        volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);

        sc.close();
    }
}