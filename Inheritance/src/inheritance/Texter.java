package inheritance;

public class Texter extends Employee{
	
	double bonus=2300D;
	
	public Texter() {
		System.out.println("This is constructor class of Texter");
	}
	
	public void showSalary() {
		System.out.println("The salary is:" + (salary+bonus) +"\n");
	}

	@Override
	public void movement() {
		System.out.println("texter");
		super.movement();// call the movement method of the parent class first then print from current movement method
		
		System.out.println("The salary is:dfnbdsbf");
	}
}
