package polimo2;

public abstract class A {
	
	protected abstract int hesapla();//ruhani durum g�vde yok paketler aras�nda kullabilirsin ama protected yap.

	protected abstract int hesap();//proje lideri oldugunu d���n ekipteki diger kiilerin baz� methodlar�n� kullanmaya zormalak i�in abstract kullan��r.
	//farkl� paketler de yapt�k bu y�den protected �nemli ama ayn� pakette olsayd� protected yazmana gerek yoktu.
	
	
	double topla() {
		return 2+3;
	}
	
	//abstract int i; tan�mlayamzs�n
	//s�n�f abstract olmal� abstract bir method kullan�yorsun.
	
	A nesneReferans;//bunu tan�mlayabilisrsin.
}
