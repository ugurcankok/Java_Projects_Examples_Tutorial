package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter your number:");
		int a=input.nextInt();
		while(a!=0) {
			sum+=a%10;
			a/=10;
		}
		System.out.print("Sum is: " + sum);
	}

}
