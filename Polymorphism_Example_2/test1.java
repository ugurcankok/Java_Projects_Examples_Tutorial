package polimo1;

public class test1 {

	public static void main(String[] args) {
		
		sekil nesneReferans;//en �st seviye olmal� onun �zerinden di�erlerina ula��yorsun
		
		sekil nesne=new sekil(14f,53f);
		Dortgen nesne1=new Dortgen((float)13,45f);
		Ucgen nesne2=new Ucgen(10,20);
		
		
		nesneReferans=nesne1;
		System.out.println(nesneReferans.Alan());
		
		
		nesneReferans=nesne;
		nesneReferans.Alan();
		
		
		nesneReferans=nesne2;
		nesneReferans.Alan();

	}

}
