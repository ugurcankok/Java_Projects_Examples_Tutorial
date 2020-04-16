package string.java;

import java.util.*;

public class string {

	public static void main(String[] args) {
		
		char [] charstring= {'u','g','u','r'};// an array of character 
		
		Scanner scanner=new Scanner(System.in);
		
		String str=new String(charstring);//make string from character array
		
		System.out.println("String is: " + str);
		
		System.out.println("Enter new string:");
		str=scanner.nextLine();
		System.out.println("String is: " + str);
		
		String str1="Hello",str2="hello";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));//Case sensitive
		System.out.println(str1.charAt(2));// find the character at the given index
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.substring(2, 4));
		
		String str3="this-is-a-java";
		String[] array=str3.split("-");
		
		for(String sp:array) {
			System.out.println(sp);
		}
		
		String str4="   merhaba   ";
		System.out.println(str4.trim());
		//imitable cannot change StringBuilder faster than StringBuffer but thread safety is necessary stringbuffer is fine
		StringBuffer sBuffer=new StringBuffer();//default capacity 16
		System.out.println(sBuffer.capacity());
		
		sBuffer=new StringBuffer(50);
		System.out.println(sBuffer.capacity());
		
		sBuffer=new StringBuffer("ugurcan");
		System.out.println(sBuffer.capacity());
		
		StringBuilder sBuilder=new StringBuilder("Merhaba");
		System.out.println(sBuilder);
		
		sBuffer.append(".hola");
		sBuilder.append(".hola");
		System.out.println(sBuffer+" \n"+sBuilder);
		
		System.out.println(sBuffer.insert(2, "A")+" \n"+sBuilder.insert(3, "B"));
		
		System.out.println(sBuffer.reverse()+" \n"+sBuilder.reverse());
		
		
		
		
	}

}
