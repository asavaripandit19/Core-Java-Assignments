import java.util.Scanner;
public class CaseConverter{
	public static void main(String[] args){
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter charater:  ");
		ch=sc.next().charAt(0);

		if(Character.isLowerCase(ch))
			System.out.println("Uppercase: " + Character.toUpperCase(ch));
		else if(Character.isUpperCase(ch))
			System.out.println("Lowercase: " + Character.toLowerCase(ch));
		else 
			System.out.println("Not an alphabet character.");
		
	}

}