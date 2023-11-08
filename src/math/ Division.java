package math;

import java.util.Scanner;
public class Division {
    	  Scanner scan=new Scanner(System.in);
	public void divide() {
		System.out.println("Enter num1: ");
		double num1=scan.nextDouble();
		System.out.println("Enter num2: ");
		double num2=scan.nextDouble();
		double result=+num2 / +num1;
		System.out.println("The result is: "+result);
     }
}
