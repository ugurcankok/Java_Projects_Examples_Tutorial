package polimoo2;

import polimo2.A;

public class B extends A{

	@Override
	protected int hesapla() {//faklý paketten miras aldýk protected olarak tanýmladýk misras aldýgýmýz yerden ve bunun içini biz dolduracaz.farklý paket olunca kalýtým aldýgýn sýnýfý import ediyoruz.
		
		
		return 0;
	}

	@Override
	protected int hesap() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//A a=new A();//abstract sýnýfý böyle çaðýramazsýn.A sýnýnfý içinde de tanýmlayamazsýn.

}
