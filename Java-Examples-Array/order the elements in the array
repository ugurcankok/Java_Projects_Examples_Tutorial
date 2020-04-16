package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("How many will you enter:");
		int number=input.nextInt();
		int [] array=new int[100];
		for(int i=0;i<number;i++) {
			System.out.print((i+1)+".Enter your number:");
		    array[i]=input.nextInt();
		}
		for(int i=0;i<number-1;i++) {
			for(int j=i+1;j<number;j++) {
				if(array[j]<array[i]) {
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		System.out.println("\nNew array");
		for(int i=0;i<number;i++) {
			System.out.print("\t"+array[i]);
		}
	}
}
