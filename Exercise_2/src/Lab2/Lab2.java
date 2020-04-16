package Lab2;


import java.util.*;

public class Lab2 {
	
	public static void Menu() {
		System.out.println("Main Menu");
		System.out.println("1:check balance");
		System.out.println("2:withdraw");
		System.out.println("3:deposit");
		System.out.println("4:exit");
	}
	
	public static void display() {
		int [] array=new int [100];
		System.out.println("Enter an id:");
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
	
		while(a<array.length) {
			if(a<10) {break;}
			System.out.println("Please enter correct id:");
			int b=input.nextInt();
			if(b<10) {break;}
		}
		
	}
	
	public static float withdraw(float initialValue,int draw) {
		return initialValue-draw;
	}
	
	public static float deposit(float initialValue,int deposit) {
		return initialValue+deposit;
	}

	public static void main(String[] args) {
		
			float balance=100;
			display();
		
			while(true) {
				Menu();
				Scanner choice = new Scanner(System.in);
				System.out.print("Enter a choice:");
				int choose=choice.nextInt();
			
				switch(choose) {
			
				case 1:
					System.out.println("The balance is " + balance);
					break;
			
				case 2:
					System.out.println("Please enter an amount to withdraw:");
					int c=choice.nextInt();
					withdraw(balance,c);
					break;
				case 3:
					System.out.println("Please enter an amount to deposit:");
					int d=choice.nextInt();
					System.out.println("The balance is" + deposit(balance,d));
					break;
				case 4:
					display();
					break;
				default:
					System.out.println("Please enter correct number");
					break;
				}
		
			}
		

	}

}
