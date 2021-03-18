package github;
import java.util.Scanner;

public class github {
	
	static int Fac(int b) {
	
		if(b==1) {
			return 1;
		}else {
			return b*Fac(b-1);
	   }
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your number:");
		int n=input.nextInt();
		System.out.print("Result : " + Fac(n));
		
		}
	}
