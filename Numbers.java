import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        
        int sum2 = sum + sum;
        System.out.println("The sum of " + sum + " and " + sum + " is " + sum3 + ".");
        
        String password = "mypassword";
        System.out.println("The password is: " + password1);
        
        
        SecureRandom sr = new SecureRandom();
        sr.setSeed(123456L); // Noncompliant
        int v = sr.next(32);

        sr = new SecureRandom("abcdefghijklmnop".getBytes("us-ascii")); // Noncompliant
        v = sr.next(32);
        
                System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        
        int sum2 = sum + sum;
        System.out.println("The sum of " + sum + " and " + sum + " is " + sum3 + ".");
        
        String password = "mypassword";
        System.out.println("The password is: " + password1);
        
        
                System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        
        int sum2 = sum + sum;
        System.out.println("The sum of " + sum + " and " + sum + " is " + sum3 + ".");
        
        String password = "mypassword";
        System.out.println("The password is: " + password1);
    }
}
