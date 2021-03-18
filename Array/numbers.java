package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		int number;
		int [] array=new int [100];
		int odd=0,even=0,prime=0;
		Scanner input=new Scanner(System.in);
		System.out.println("How many number will you enter:");
	    number=input.nextInt();
	    
	    for(int i=0;i<number;i++) {
	    	
	    	System.out.println((i+1)+".enter your number:");
	    	array[i]=input.nextInt();
	    	
	    }
		
	    for(int j=0;j<number;j++) {
	    	int sayi=array[j];
	    	if(sayi%2==0) 
	    		even++;
	    	else if(sayi%2==1)
	    		odd++;
	    	int bolen=0;
	    	for(int k=1;k<=sayi;k++) {
	    		if(sayi%k==0)
	    			bolen++;
	    	}
	    	if(bolen==2)
	    		prime++;
	    }
	    System.out.println("Total even number:"+even);
	    System.out.println("Total odd number:"+odd);
	    System.out.println("Total prime number:"+prime);
	}
}
