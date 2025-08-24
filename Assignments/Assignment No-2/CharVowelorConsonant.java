import java.util.Scanner;
public class CharVowelorConsonant{
	public static void main(String[] args){
		char ch;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Character: ");
		ch=sc.next().charAt(0);

		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
			System.out.println(ch+ " is Vowel ");
		else
			System.out.println(ch+ " is Consonant ");

		
	}
}