import java.util.Scanner;
public class TimeValid{
	public static void main(String[] args){
		float hr,sec,min;
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hour: ");
		hr = sc.nextInt();
		System.out.print("Enter minute: ");
		min = sc.nextInt();
		System.out.print("Enter Second: ");
		sec = sc.nextInt();

		if(hr>=0 && hr<24){
			if(min>=0 && min<60){
				if(sec>=0 && sec<60)
					System.out.print("Time is Valid");
				else
					System.out.print("Time is Invalid");
			}	
			else
				System.out.print("Minute is Invalid");
			}
		else
			System.out.print("Hour is Invalid");	
	}
}