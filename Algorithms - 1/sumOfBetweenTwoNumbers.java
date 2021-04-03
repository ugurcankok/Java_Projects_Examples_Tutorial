package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter initial value:");
		int a=input.nextInt();
		System.out.print("Please enter final value:");
		int b=input.nextInt();
		System.out.print("Please enter increment value:");
		int c=input.nextInt();
		for(int i=a;i<=b;i+=c) {
			sum+=i;
		}
		System.out.print("Sum is: " + sum);
	}

}
