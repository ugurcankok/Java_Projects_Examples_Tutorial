package polimo;

public class test {

	
	public static void main(String[] args) {
		
		A aNesnesi=new A();
		B bNesnesi=new B();
		C cNesnesi=new C();
		D dNesnesi=new D();
		
		A sýnýfReferans=bNesnesi;
		sýnýfReferans.yaz();
		
		sýnýfReferans=bNesnesi;
		sýnýfReferans.yaz();
		
		sýnýfReferans= aNesnesi;//kendisinden üst seviyedeki elemana ulaþamaz.cascading yaparsýn.buraya gelene kadar çalýþýr bundan sonra çöker çalýþma zaman hatasý bu yüzden en sýnýf yapmaslýsýn en baþta
		sýnýfReferans.yaz();


	}

}
