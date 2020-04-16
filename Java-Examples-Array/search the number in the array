package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		int yer=-1;
		int []array=new int[100];
		Scanner input=new Scanner(System.in);
		System.out.print("How many elements will enter:");
		int a=input.nextInt();
		
		for(int i=0;i<a;i++) {
			System.out.print((i+1)+".Enter elements:");
			array[i]=input.nextInt();
		}
		
		System.out.print("Enter your number for searching:");
		int ara=input.nextInt();
		
		for(int i=0;i<a;i++) {
			if(array[i]==ara) {
				yer=i;
				break;
			}
		}
		
		if(yer!=-1) {
			System.out.print("Found your number where " + yer + ".index");
		}else {
			System.out.print("Not found your number!!");
		}
		
	}
}
