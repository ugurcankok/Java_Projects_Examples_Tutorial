package finalKelime;

public abstract class A {

	final double PI=3.14;//kimse de�i�tirmesin diye de�i�ken �n�nde final kulland�k.
	
	protected double hesapla(int a,double b) {
		return a+b;
	}
	
	protected abstract double hesapla1(int c,double d);
	
	
	protected final double hesapla2(int a1,double b1) {//herhangi bir de�i�iklik olmas�n� istemiyorsan final kullan methodun veya de�i�kenin �n�nde
		return a1*b1;
	}
}
