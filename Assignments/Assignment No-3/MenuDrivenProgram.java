import java.util.Scanner;
public class MenuDrivenProgram{
	public static void main(String[] args){
		int n1,n2,ch;
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a first Number: ");
		n1=sc.nextInt();
		System.out.println("Enter a Second Number: ");
		n2=sc.nextInt();

		while(true)
		{
			System.out.println(""" 
 
				1.Check Equality
				2.Less than
				3.Quotient and Remainder 
				4.Range
				5.Swap 
				6.EXIT 
				Enter a Choice: """);
			ch = sc.nextInt();


			switch(ch){
				case 1->{if(n1==n2)
						System.out.println("Numbers are equal");
					else
						System.out.println("Numbers are not equal");}
				case 2->{if(n1<n2)
						System.out.println("First number is less than Second ");
					else if(n1>n2)
						System.out.println("Second number is less than first ");
					else
						System.out.println("Both are Equal");}
				case 3->{ int quotient = n1/n2;
						System.out.println("Quotient : "+quotient);
					  int remainder = n1%n2;
						System.out.println("Remainder : "+remainder);
					}
				case 4->{
					System.out.println("Enter a number: ");
					int n=sc.nextInt();
					if(n>n1 && n<n2)
						System.out.println(n+" lies between "+n1+" and "+n2);
					else
						System.out.println(n+" does not lies between "+n1+" and "+n2);
					}
				case 5->{
						System.out.println("Before swapping First number is "+n1+" and Second number is"+n2);
						n1=(n1+n2)-(n2=n1);
						System.out.println("After swapping First number is "+n1+" and Second number is"+n2);
					}
				case 6->System.exit(0);
				default->System.out.println("INVALID CHOICE!!");

			}	

		}

	
		
		
	}
}