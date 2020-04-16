package interface2;

public class PublicSýnf {

	//default için yaptýklarýn burda da gecerli
	
	interface IDeneme3{
		//sýnýf içinde de tanýmlanabilir.
		public void hola();
		//static ve fianl kullanýlabilir.interface içindeki olaya baþka interface erieþemez.
	}
	
	class IcSýnýf implements IDeneme3{

		@Override
		public void hola() {
			// TODO Auto-generated method stub
			
		}
		//sadece kendi classýn görür sýnýf içindeki interface olayýný.
	}
}
