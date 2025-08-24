import java.util.Scanner;
public class ProfitLoss{
	public static void main(String[] args){
		int cp,sp;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Cost price: ");
		cp = sc.nextInt();
		System.out.println("Enter Selling price: ");
		sp = sc.nextInt();

		if(cp>sp)
			System.out.println("Loss");
		else
			System.out.println("Profit");

	}
		
}