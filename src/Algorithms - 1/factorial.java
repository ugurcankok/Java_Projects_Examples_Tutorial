package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter your number:");
		int a=input.nextInt();
		int result=1;
		for(int i=1;i<=a;i++) {
			result*=i;
		}
		System.out.print("Factorial is : " + result);
	}

}
