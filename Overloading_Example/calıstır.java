package overloading;

public class cal�st�r {

	public static void main(String[] args) {
		
		Hamsi hamsi=new Hamsi(2, false, "mavi", 2, "karadeniz");
		System.out.println(hamsi.bal�k�nfo());
		
		hamsi=new Hamsi(3, true, "k�rm�z�", 3, "marmara");
		System.out.println(hamsi.bal�k�nfo());
		
		hamsi=new Hamsi(1, true, "k�rm�z�", 4, "karamarmara");
		System.out.println(hamsi.bal�k�nfo(14,15.66));
		
	}

}
