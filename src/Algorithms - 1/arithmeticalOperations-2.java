package github;
import java.util.Scanner;

public class github {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your first number:");
		int a=input.nextInt();
		System.out.println("Please enter your second number:");
		int b=input.nextInt();
		
		System.out.println("Sum:"+(a+b));
		System.out.println("Sub:"+(a-b));
		System.out.println("Mul:"+(a*b));
		System.out.println("Div:"+(a/b));
	}

}
