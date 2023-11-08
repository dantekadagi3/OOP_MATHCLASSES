package math;
import java.util.Scanner;
public class division {
	Scanner in=new Scanner(System.in);
	public void divide() {
		System.out.println("Enter num1: ");
		double num1=in.nextDouble();
		System.out.println("Enter num2: ");
		double num2=in.nextDouble();
		double result=+num2 / +num1;
		System.out.println("The result is: "+result);
}
}