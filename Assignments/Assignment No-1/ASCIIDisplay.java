import java.util.Scanner;

public class ASCIIDisplay {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);

        int asciiValue = (int) ch;  // typecast char to int
        System.out.println("ASCII value of '" + ch + "' is: " + asciiValue);
    }
}
