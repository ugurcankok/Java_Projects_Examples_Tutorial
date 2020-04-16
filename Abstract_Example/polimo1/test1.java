package polimo1;

public class test1 {

	public static void main(String[] args) {
		
		sekil nesneReferans ;//en üst seviye olmalı onun üzerinden diğerlerina ulaşıyorsun
		
		
		Dortgen nesne1=new Dortgen((float)13,45f);
		Ucgen nesne2=new Ucgen(10,20);
		
		
		
		
		
		nesneReferans=nesne1;
		System.out.println(nesneReferans.Alan());
		nesneReferans.yaz();
		
		nesneReferans=nesne1;
		nesneReferans.Alan();
		System.out.println(nesneReferans.yaz1());
		
		nesneReferans=nesne2;
		nesneReferans.Alan();

	}

}
