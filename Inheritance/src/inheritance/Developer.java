package inheritance;

public class Developer extends Employee{
	double bonus=200D;
	public Developer() {
		System.out.println("This is conctructor class of Developer");
	}
	
	public void ShowSalary() {
		System.out.println("The salary is:" +(salary+bonus)+"\n");
	}
	
	@Override
	public void movement() {
		System.out.println("developer");
	}

}
