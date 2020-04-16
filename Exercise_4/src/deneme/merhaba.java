package deneme;

import java.util.Scanner;

public class merhaba {
	
	static int sayii=8;//static olursa değişken veya method new kullanmadan da kullanabilirsin demek
	static int sayii1;
	
	static {
		sayii1=sayii*5;
		System.out.println("One value is:"+sayii+"Second value :"+sayii1);
	}
	
	static void yaz(int i) {
		System.out.println("Sayi"+i);
	}
	

	//String name="kerem";
	
	public static void main(String[] args) {
		
		yaz(150);
		personInfo nesne=new personInfo();
		personInfo nesne2=nesne;
		
		nesne.name="ugurcan";
		nesne.lastname="kök";
		nesne.age="35";
		nesne.city="Aydın";
		
		System.out.println("Name is "+nesne.name+" ,lastname is "+nesne.lastname+" ,age is "+nesne.age+" and his/her city is "+nesne.city);
		//System.out.print("Name is "+nesne.name);
		System.out.println("--------------");
		
		
		System.out.println("Name is "+nesne2.name+" ,lastname is "+nesne2.lastname+" ,age is "+nesne2.age+" and his/her city is "+nesne2.city);
		//System.out.print("Name is "+nesne.name);
		System.out.println("--------------");
		
		
		nesne2.name="kerem";
		nesne2.lastname="kök";
		nesne2.age="30";
		nesne2.city="izmir";
		System.out.println("Name is "+nesne2.name+" ,lastname is "+nesne2.lastname+" ,age is "+nesne2.age+" and his/her city is "+nesne2.city);
		
		System.out.println("--------------");
		
		System.out.println("Name is "+nesne.name+" ,lastname is "+nesne.lastname+" ,age is "+nesne.age+" and his/her city is "+nesne.city);
		

	}

}

