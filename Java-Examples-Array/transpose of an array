package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your NxN matrix size:");
		int n=input.nextInt();
		int [][]matrix=new int[10][10];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((i+1)+".row -"+(j+1)+".column:");
				matrix[i][j]=input.nextInt();
			}
			
			System.out.print("\n");
		}
		System.out.println("Normal");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.print("\n\n");
		}
		
		System.out.println("Transpose");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("\t"+matrix[j][i]);
			}
			System.out.print("\n\n");
		}
	}
}
