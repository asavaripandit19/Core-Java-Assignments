import java.util.Scanner;
public class CurrencyNotes{
	public static void main(String[] args){
		int one,five,ten;
		int amount;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount to be withdrawn: ");
		amount = sc.nextInt();

		ten = amount/10;
		amount = amount%10;

		five = amount/5;
		amount = amount%5;

		one = amount;

		System.out.println("10 Rupayee notes: "+ten);
		System.out.println("5 Rupayee notes: "+five);
		System.out.println("1 Rupayee notes: "+one);
		
	}

}
