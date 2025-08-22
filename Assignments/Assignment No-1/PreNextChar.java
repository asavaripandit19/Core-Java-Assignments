import java.util.Scanner;
public class PreNextChar{
	public static void main(String[] args){
		char c,pre,next;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character: ");
		c = sc.next().charAt(0);   // next-read the next word/token,ChatAt-positions starting from 0
		
		pre = (char)(c - 1); // char - for type type casting e.g-a=97+1=98=int so,we use char
		next =(char)(c + 1);

		System.out.println("Entered Character is: "+c);
		System.out.println("Previous Character: "+pre);
		System.out.println("Next Character is: "+next);



	}
		
}