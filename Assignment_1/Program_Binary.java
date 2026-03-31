
import java.util.Scanner;

public class Program_Binary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Accept input
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        // Display original number
        System.out.println("Given Number :" + num);

        // Convert and display
        System.out.println("Binary equivalent :" + Integer.toBinaryString(num));
        System.out.println("Octal equivalent :" + Integer.toOctalString(num));
        System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num));

        sc.close();
    }
}