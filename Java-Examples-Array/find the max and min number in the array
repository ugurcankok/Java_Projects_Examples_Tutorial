package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		int []array=new int[100];
		Scanner input=new Scanner(System.in);
		System.out.print("How many elements will enter:");
		int a=input.nextInt();
		
		for(int i=0;i<a;i++) {
			System.out.print((i+1)+".Enter elements:");
			array[i]=input.nextInt();
		}
		
		int max=array[0];
		int min=array[0];
		
		for(int i=0;i<a;i++) {
			if(array[i]<min) {
				min=array[i];
			}
			if(array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.print("Max number is: " + max);
		System.out.print("\nMin number is: " + min);
		
	}
}
