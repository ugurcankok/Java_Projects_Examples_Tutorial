package interface2;

public class PublicS�nf {

	//default i�in yapt�klar�n burda da gecerli
	
	interface IDeneme3{
		//s�n�f i�inde de tan�mlanabilir.
		public void hola();
		//static ve fianl kullan�labilir.interface i�indeki olaya ba�ka interface erie�emez.
	}
	
	class IcS�n�f implements IDeneme3{

		@Override
		public void hola() {
			// TODO Auto-generated method stub
			
		}
		//sadece kendi class�n g�r�r s�n�f i�indeki interface olay�n�.
	}
}
