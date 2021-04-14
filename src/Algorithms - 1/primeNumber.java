package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		int t=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter your number:");
		int a=input.nextInt();
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				t++;
			}
		}
		if(t==2) {
			System.out.print("Your number is prime!!");
		}else {
			System.out.print("Your number is not prime!!");
		}
	}

}
