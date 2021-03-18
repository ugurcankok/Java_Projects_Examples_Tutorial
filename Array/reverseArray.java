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
		
		for(int i=0;i<a/2;i++) {
			
			int temp=array[i];
			array[i]=array[a-i-1];
			array[a-i-1]=temp;
		}
		
		for(int i=0;i<a;i++) {
			System.out.print("\t"+array[i]);
		}
		
	}
}
