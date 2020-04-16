package classes;

public class object {
	
	String name;
	String id;
	String major;
	
	
	

	public object(String string, String string2, double d) {
		Name=string;
		Id=string2;
		money=d;
	}

	void setName(String stName) {
		name=stName;
	}
	
	void setMajor(String stMajor) {
		major=stMajor;
	}
	
	void display() {
		System.out.println("Name is: "+name);
		System.out.println("Id is: "+id);
		System.out.println("Major is: "+major +"\n");
		
	}
/*
 * constructor when the object is created constructor is invoked
 * no return type
 * name of const. must be same class name
 * initialize class member
 * 
 * */
	
	private String Name;
	private String Id;
	private double money;
	
	public  object() {
		Name="";
		Id="";
		money=0.0;
	}
	
	
	public void setDetails(String isim,String tc) {
		Name=isim;
		Id=tc;
	}
	
	public void deposit(double  para) {
		money+=para;
	}
	public void getDetails() {
		System.out.println("Name is: "+Name);
		System.out.println("Id is: "+Id);
		System.out.println("Major is: "+money +"\n");
	}
}
