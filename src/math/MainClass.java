package math;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello Members");
		
		
		System.out.println("1.Addition");
		System.out.println("2.Circle Area");
		System.out.println("3.Circle Perimeter");
		System.out.println("4.Multilplication");
		System.out.println("5.Rectangle perimeter");
		System.out.println("6.Subtraction");
		System.out.println("7.Triangle Area");
		System.out.println("8.Division");
		
		System.out.println("Select your option:");
		int option=sc.nextInt();
		
		switch(option) {
		case 1:
			addition add=new addition();
			add.sum();
			break;
		case 2:
			Circle_area cer=new Circle_area();
			cer.circle_area();
			break;
		case 3:
			Circle_perimeter cper=new Circle_perimeter();
			cper.circle_per();
			break;
			
		case 4:
			Multiplication mulp=new Multiplication();
			mulp.multiply();
			break;
		case 5:
			RectanglePerimeter per=new  RectanglePerimeter();
			per.perimeter();
			break;
		case 6:
			Subtraction sub=new Subtraction();
			sub.difference();
			break;
		case 7:
			TriangleArea trea=new TriangleArea();
			trea.trangarea();
			break;
		case 8:
			division div=new division();
			div.divide();
			break;
			
			default:
				System.out.println("Kindly select a valid option");
		}
		
		
		
	}

}
