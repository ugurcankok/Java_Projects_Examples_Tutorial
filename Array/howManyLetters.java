package github;
import java.util.Scanner;

public class github {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your word:");
		String kelime=input.next();
		
		int [] word = new int[26];
		for(int i=0;i<kelime.length();i++) {
			word[((int)kelime.charAt(i))-97]++;
		}
		for(int i=0;i<word.length;i++) {
			if(word[i]!=0) {
				System.out.println(((char)(i+97))+"\t"+word[i]);
			}
		}
	}
}
