package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		final double PI=3.14;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter one edge of triangle:");
		double a=input.nextInt();
		System.out.println("Please enter other edge:");
		double b=input.nextInt();
		
		double c= Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs is:" + c);
		
	}

}
