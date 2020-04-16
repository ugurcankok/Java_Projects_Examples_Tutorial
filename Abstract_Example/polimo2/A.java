package polimo2;

public abstract class A {
	
	protected abstract int hesapla();//ruhani durum gövde yok paketler arasýnda kullabilirsin ama protected yap.

	protected abstract int hesap();//proje lideri oldugunu düþün ekipteki diger kiilerin bazý methodlarýný kullanmaya zormalak için abstract kullanýýr.
	//farklý paketler de yaptýk bu yüden protected önemli ama ayný pakette olsaydý protected yazmana gerek yoktu.
	
	
	double topla() {
		return 2+3;
	}
	
	//abstract int i; tanýmlayamzsýn
	//sýnýf abstract olmalý abstract bir method kullanýyorsun.
	
	A nesneReferans;//bunu tanýmlayabilisrsin.
}
