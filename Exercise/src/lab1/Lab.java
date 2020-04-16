package lab1;
import java.util.Scanner;

public class Lab {
	
	public static int largest(int a,int  b,int  c) {
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else
			return c;
	}
	
	public static int smallest(int a,int  b,int  c) {
		if(a<b && a<c) {
			return a;
		}else if(b<a && b<c) {
			return b;
		}else
			return c;
	}
	
	public static int average(int a,int b,int c) {
		return (a+b+c)/3;
		
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=input.nextInt();
		System.out.println("Enter second number:");
		int b=input.nextInt();
		System.out.println("Enter third number:");
		int c=input.nextInt();
		
		System.out.println("For the numbers " + a + " " + b + " " + c);
		
		System.out.println("Largest number is " + largest(a,b,c));
		System.out.println("Smallest number is " + smallest(a,b,c));
		System.out.println("Average is " + average(a,b,c));

	}

}
