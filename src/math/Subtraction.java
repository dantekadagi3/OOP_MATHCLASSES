package math;
import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int difference = secondNumber - firstNumber;
        System.out.println("The difference is " + difference);

        scanner.close();
    }
}
