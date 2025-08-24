import java.util.Scanner;
public class DiscountSales{
	public static void main(String[] args){
		int qty1,qty2,qty3;
		double rate1,rate2,rate3;
		double totalAmount,discount=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter quantity of Item 1: ");
		qty1=sc.nextInt();
		System.out.println("Enter rate of Item 1: ");
		rate1=sc.nextDouble();

		System.out.println("Enter quantity of Item 2: ");
		qty2=sc.nextInt();
		System.out.println("Enter rate of Item 2: ");
		rate2=sc.nextDouble();

		System.out.println("Enter quantity of Item 3: ");
		qty3=sc.nextInt();
		System.out.println("Enter rate of Item 3: ");
		rate3=sc.nextDouble();

		totalAmount = (qty1 * rate1)+(qty2 * rate2) + (qty3 * rate3);

		if(totalAmount >5000)
			discount = (20.0/100)*totalAmount;
		else if(totalAmount >= 3000)
			discount = (15.0/100)*totalAmount;
		else if(totalAmount >= 1000)
			discount = (8.0/100)*totalAmount;
		else
			discount = 0;


		System.out.println("Total amount: "+totalAmount);
		System.out.println("Discount: "+discount);
		System.out.println("Amount to pay: "+(totalAmount - discount));



	}
}