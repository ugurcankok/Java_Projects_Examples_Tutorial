package github;
import java.util.Scanner;

public class github {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter one edge of rectangle:");
		int a=input.nextInt();
		System.out.println("Enter other edge:");
		int b=input.nextInt();
		
		int area=a*b;
		int perimeter= 2*(a+b);
		
		System.out.println("Area is: " + area + "\n" + "Perimeter is: " + perimeter);
	}

}
