
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        
        
        char lowerChar = Character.toLowerCase(inputChar);
        switch (lowerChar) {
            case 'a':
                System.out.println("You entered a vowel");
                break;
            case 'e':
                System.out.println("You entered a vowel");
                break;
            case 'i':
                System.out.println("You entered a vowel");
                break;
            case 'o':
                System.out.println("You entered a vowel");
                break;
            case 'u':
                System.out.println("You entered a vowel:");
                break;
            default:
                System.out.println("You did not enter a vowel");
                break;
        }
        
        scanner.close();
    }
}
