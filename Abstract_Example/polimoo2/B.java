package polimoo2;

import polimo2.A;

public class B extends A{

	@Override
	protected int hesapla() {//fakl� paketten miras ald�k protected olarak tan�mlad�k misras ald�g�m�z yerden ve bunun i�ini biz dolduracaz.farkl� paket olunca kal�t�m ald�g�n s�n�f� import ediyoruz.
		
		
		return 0;
	}

	@Override
	protected int hesap() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//A a=new A();//abstract s�n�f� b�yle �a��ramazs�n.A s�n�nf� i�inde de tan�mlayamazs�n.

}
