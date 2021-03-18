package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter your number:");
		int a=input.nextInt();
		
		while(a!=0) {
			System.out.print(a%10);
			a/=10;
		}
	}

}
