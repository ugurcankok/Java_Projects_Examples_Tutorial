package polimo;

public class test {

	
	public static void main(String[] args) {
		
		A aNesnesi=new A();
		B bNesnesi=new B();
		C cNesnesi=new C();
		D dNesnesi=new D();
		
		A s�n�fReferans=bNesnesi;
		s�n�fReferans.yaz();
		
		s�n�fReferans=bNesnesi;
		s�n�fReferans.yaz();
		
		s�n�fReferans= aNesnesi;//kendisinden �st seviyedeki elemana ula�amaz.cascading yapars�n.buraya gelene kadar �al���r bundan sonra ��ker �al��ma zaman hatas� bu y�zden en s�n�f yapmasl�s�n en ba�ta
		s�n�fReferans.yaz();


	}

}
