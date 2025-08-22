import java.util.Scanner;
public class RoomPaintedArea{
	public static void main(String[] args){
		double rl,rb,rh;
		double dl,db;
		double wl,wb;
		double roomArea,windowArea,totalWallArea,doorArea,roofArea,paintedArea;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter length of Room: ");
		rl=sc.nextDouble();
		System.out.print("Enter Breadth of Room: ");
		rb=sc.nextDouble();
		System.out.print("Enter height of Room: ");
		rh=sc.nextDouble();

		System.out.print("Enter length of Door: ");
		dl=sc.nextDouble();
		System.out.print("Enter breadth of Door: ");
		db=sc.nextDouble();

		System.out.print("Enter length of Window: ");
		wl=sc.nextDouble();
		System.out.print("Enter breadth of Window: ");
		wb=sc.nextDouble();

		roomArea = 2*rh*(rl+rb); 
		doorArea = dl*db;
		windowArea = 2*(wl*wb);
		roofArea = rl*rb;
		paintedArea = roomArea -(doorArea+windowArea);


		System.out.println("Painted Area : "+paintedArea);
		System.out.println("Roof Area : "+roofArea);


	}

		
}