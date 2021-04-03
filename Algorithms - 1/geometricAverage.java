package github;
import java.util.Scanner;

public class github {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double ort=1.0;
		int n=0,sayý=0;
		do {
			System.out.print("Enter your numbers if you want to exit press 0:");
			sayý=input.nextInt();
			if(sayý!=0) {
				ort*=sayý;
				n++;
			}
		}while(sayý!=0);
        ort =Math.pow(ort, 1.0/(double)n);
        System.out.print("Your geometric average is: " + ort);
	}

}
