package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		final double PI=3.14;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter radius of sphere:");
		int a=input.nextInt();
		
		double area=4*(PI*(a*a));
		double volume= (4*(PI*(a*a*a)))/3;
		
		System.out.println("Area is: " + area + "\n" + "Volume is: " + volume);
	}

}
