package Ananymous;

public class TestAbstract {

	public static void main(String[] args) {
		
		AbstractClass abst=new AbstractClass() {			
			public void display() {
				System.out.println("Anonymous inner class");
			}
	
		};

		abst.display();
	
	
		MyInterface inter=new MyInterface() {
			public void displayText() {
				System.out.println("Ýnterface anonymous...");
			}
		};
		
		inter.displayText();
	
	
	}
}
