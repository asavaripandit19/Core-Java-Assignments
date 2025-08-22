import java.util.Scanner;
public class EmployeeSalary{
	public static void main(String[] args){
		int hra=10,da=30,tax=3;
		double basicSal,takeHomeSal,totalSal; 
		int ID;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		ID = sc.nextInt();
		System.out.println("Enter Basic Salary: ");
		basicSal = sc.nextDouble();

		totalSal = basicSal+((basicSal*(da+hra))/100);
		takeHomeSal = totalSal - ((totalSal*tax)/100);

		System.out.println("The take home salary of the employee is: "+takeHomeSal);
		


	}
	
}