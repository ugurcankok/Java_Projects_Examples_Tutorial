package github;
import java.util.Scanner;
/* 
serial
n/(n+1) 
*/

public class github {
	
	static double Seri(double n) {
		if(n<1) {
			return 0;
		}else {
			return n/(n+1) + Seri(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		double a;
		Scanner input=new Scanner(System.in);
	    System.out.print("Please enter seri number:");
		a=input.nextInt();
		System.out.print("Your result is: " + Seri(a) );
		
		}
	}
