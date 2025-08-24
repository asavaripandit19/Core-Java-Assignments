import java.util.Scanner;
public class CharacterCheck{
	public static void main(String[] args){
		char ch;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter something: ");
		ch=sc.next().charAt(0);

		
		if (ch >= 48 && ch <= 57)
			 System.out.println("The character is a Digit.");
		else if ((ch >= 97 && ch <= 122)||(ch >= 65 && ch <= 90))
			System.out.println("The character is a  Alphabet.");
		else
			System.out.println("Charcter is Symbol");
	}
}