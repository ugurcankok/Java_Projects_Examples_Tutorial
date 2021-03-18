package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		int [] array=new int[5];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.print((i+1) + ".Enter your number:");
			array[i]=input.nextInt();
		}
		
	}
}
