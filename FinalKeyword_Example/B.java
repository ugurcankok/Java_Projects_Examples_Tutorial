package finalKelime;

public class B extends A {//final sözcüðü kullandýgýn için  miras alamazsýn.abstract ve final birbirinin tam tersidir.O yüzden finali kaldýrdým A da.

	@Override
	protected double hesapla1(int c, double d) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	@Override
	protected final double hesapla2(int a1,double b1) {miras aldýgýn sýnýfta method final olarak tanýmlanmýþsa override edemezsin.
		return a1*b1;
	}
	*/
}
