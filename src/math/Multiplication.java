package math;

import java.util.Scanner;

public class Multiplication {
	Scanner scanner = new Scanner(System.in);
public void multiply() {
    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt();

    int product= firstNumber*secondNumber;
    System.out.println("The product is " + product);
}

}
