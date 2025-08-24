import java.util.Scanner;
public class DisplayIncomeTax{
	public static void main(String[] args){
		double basicSalary,tax;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basic salary: ");
		basicSalary = sc.nextDouble();
		
		if(basicSalary<150000)
			tax=0;
		else if(basicSalary <= 300000)
			tax=(20.0/100)*basicSalary;
		else
			tax=(30.0/100)*basicSalary;

		System.out.println("Income Tax: "+tax);

		
	}
	
}
