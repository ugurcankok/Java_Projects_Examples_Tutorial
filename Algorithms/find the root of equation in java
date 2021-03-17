package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your value of a:");
		int a=input.nextInt();
		System.out.print("Enter your value of b:");
		int b=input.nextInt();
		System.out.print("Enter your value of c:");
		int c=input.nextInt();
		
		int d=(b*b-4*a*c);
		if(d<0) {
			System.out.print("There is no root!!");
		}else if(d==0) {
			double root1=(-b+(int) Math.sqrt(d))/(2*a);
			System.out.print("Only one root: " + root1);
		}else {
			double root1=(-b+(int) Math.sqrt(d))/(2*a);
			double root2=(-b-(int) Math.sqrt(d))/(2*a);
			System.out.print("First root is: " + root1);
			System.out.print("Second root is: " + root2);
		}
	}

}
