package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		int a,b,c;
		int []array=new int[100];
		Scanner input=new Scanner(System.in);
		System.out.print("how many elements will enter:");
		a=input.nextInt();
		
		for(int i=0;i<a;i++) {
			System.out.print((i+1)+".Enter elements:");
			array[i]=input.nextInt();
		}
		
		System.out.print("Enter your first index:");
		b=input.nextInt();
		
		System.out.print("Enter your second index:");
		c=input.nextInt();
		
		int temp=array[b];
		array[b]=array[c];
		array[c]=temp;
		
		for(int i=0;i<a;i++) {
			System.out.print("\t"+array[i]);
		}
		
	}
}
