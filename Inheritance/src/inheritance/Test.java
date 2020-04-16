package inheritance;

public class Test {

	public static void main(String[] args) {
		/*Developer dev=new Developer();
		dev.ShowSalary();
		
		Texter text=new Texter();
		text.showSalary();*/
		
		Employee employee = new Employee();
		employee.movement();
		
		employee=new Developer();
		employee.movement();

		employee=new Texter();
		employee.movement();
	}

}
