import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        
        int sum = 0;

        
        for (int i = 2; i <= n; i += 2) {
            sum += i; 
        }

       
        scanner.close();

        
        System.out.println("The sum of all even numbers up to " + n + " is: " + sum);
    }
}
