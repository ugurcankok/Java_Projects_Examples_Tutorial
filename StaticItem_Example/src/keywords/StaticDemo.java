package keywords;
import java.util.*;

public class StaticDemo {
	static int StaticVar;
	int var;
	
	public StaticDemo() {
		var=0;
	}
	
	public static void SetStaticVar(int x) {//static methods can only access static variables
		StaticVar=x;
	}
	
	public void increase() {
		var++;
		StaticVar++;
	}
	
	public void display() {
		System.out.println("The value static variable: " + StaticVar);
		System.out.println("The value non-static variable: " + var + "\n");
		
	}
	

	public static void main(String[] args) {
		
		StaticDemo str1=new StaticDemo();
		StaticDemo str2=new StaticDemo();
		
		str1.increase();
		str1.increase();
		str1.display();
		
		
		str2.increase();
		str2.increase();
		str2.increase();
		str2.display();//static kaldıgı yerden saymaya devam ediyor
		
		StaticDemo.SetStaticVar(50);
		System.out.println("Static variable without object: " + StaticDemo.StaticVar );
		
	}

}
