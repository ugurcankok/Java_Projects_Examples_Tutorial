package deneme;

public class personInfo {
	
	String name;
	String lastname;
	String age;
	String city;
	
	void dıssınıf() {//method içinde kullanıyon!
	
	Icsınıf nesne=new Icsınıf();
	nesne.function();
	}
	public int sayi1;//herkese acık
	protected int sayi2;//miras olursa kullanır set ve get ile kullanabilirsin
			int sayi3;//default sadece kendi paketinin içi
	private int sayi4;//sınıfın kendisine has
	
	public int getSayi1() {
		return sayi1;
	}
	public void setSayi1(int sayi1) {
		this.sayi1 = sayi1;
	}
	public int getSayi2() {
		return sayi2;
	}
	public void setSayi2(int sayi2) {
		this.sayi2 = sayi2;
	}
	public int getSayi3() {
		return sayi3;
	}
	public void setSayi3(int sayi3) {
		this.sayi3 = sayi3;
	}
	public int getSayi4() {
		return sayi4;
	}
	public void setSayi4(int sayi4) {
		this.sayi4 = sayi4;
	}
	
	//static olunca da new olmayacgı için sınıfın adını yazarak tanumlayabilirsin.static static ile çalışır sadece
	//merhaba.sayii(150); bu şekilde başka main içinde kullanabiliyoruz.static bir method static değişken kullanır.mirasta super ve this kullanamzsın static ise yani.
	//final ise mirasta kullanamazsın,değişken ise değeri değiştiremezsin override de edilemez final olarak tanımlarsan ilk değeri vermen lazım final olarak tanımlarsan set değeri de olmaz.
	
	
	class Icsınıf{
		//iç içe sınıflar tanımlanabiliyor.
		int sayi1;//değerler farklı olabilir her sınıf kendi değerini kullanır classlar birbirini çağırabilir.
		personInfo nesne=new personInfo();
		
		void function() {
			
		}
	}
	
}
