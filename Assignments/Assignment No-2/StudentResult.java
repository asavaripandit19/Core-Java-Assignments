import java.util.Scanner;
public class StudentResult{
	public static void main(String[] args){
		int sub1,sub2,sub3,total;
		double average ;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks of Subject 1: ");
		sub1 = sc.nextInt();
		System.out.print("Enter marks of Subject 2: ");
		sub2 = sc.nextInt();
		System.out.print("Enter marks of Subject 3: ");
		sub3 = sc.nextInt();

		total=sub1+sub2+sub3;
		average=total/3.0;

		System.out.println("Total marks: "+total);
		System.out.println("Average marks: "+average);


		if(average>=60)
			System.out.println("Class:First Class ");
		else if(average>=50)
			System.out.println("Class:Second Class ");
		else if(average>=40)
			System.out.println("Class:Third Class ");
		else
			System.out.println("Class: Fail ");

	}
	
}