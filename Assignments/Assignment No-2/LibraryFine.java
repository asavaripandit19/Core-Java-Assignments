import java.util.Scanner;
public class LibraryFine{
	public static void main(String[] args){
		int daysLate,fine=0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of days late:  ");
		daysLate = sc.nextInt();

		if(daysLate < 5)
			fine=daysLate*2;
		else if(daysLate < 10)
			fine=daysLate*5;
		else
			fine=daysLate*10;

		System.out.println("Fine to be paid: "+fine);

		
		
	}
}