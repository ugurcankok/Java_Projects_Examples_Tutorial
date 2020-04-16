package finalKelime;

public abstract class A {

	final double PI=3.14;//kimse deðiþtirmesin diye deðiþken önünde final kullandýk.
	
	protected double hesapla(int a,double b) {
		return a+b;
	}
	
	protected abstract double hesapla1(int c,double d);
	
	
	protected final double hesapla2(int a1,double b1) {//herhangi bir deðiþiklik olmasýný istemiyorsan final kullan methodun veya deðiþkenin önünde
		return a1*b1;
	}
}
