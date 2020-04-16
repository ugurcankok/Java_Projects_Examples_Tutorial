package classes;
import java.util.*;

public class classObject {

	public static void main(String[] args) {
		object obj1=new object();
		object obj2=new object();
		
		obj1.setName("ugurcan");
		obj1.id="101";
		obj1.setMajor("computer science");
		
		obj2.setName("kerem");
		obj2.id="102";
		obj2.setMajor("teacher");
		
		obj1.display();
		obj2.display();
		

		object obj3=new object();
		object obj4=new object("ugur","sdfsdfsd",1000D);
		
		obj3.setDetails("kerem", "64757");
		obj3.deposit(1233D);
		
		obj3.getDetails();
		obj4.getDetails();

	}

}
