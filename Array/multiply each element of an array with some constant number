package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		double [] array=new double[100];
		double [] array1=new double [100];
    
		Scanner input=new Scanner(System.in);
		System.out.print("How many salary will you enter:");
		int a=input.nextInt();
		for(int i=0;i<a;i++) {
			System.out.print((i+1)+".Enter your salary:");
			array[i]=input.nextDouble();
		}
		System.out.print("Enter your salary increase:");
		double b=input.nextDouble();
		for(int i=0;i<a;i++) {
			array1[i]=array[i]*b;
		}
		System.out.print("\tOld\tNew\tIncrease\n\n");
		for(int i=0;i<a;i++) {
			System.out.println("\t"+array[i]+"\t"+array1[i]+"\t"+(array1[i]-array[i]));
		}
	}
}
