package overloading;

public class calýstýr {

	public static void main(String[] args) {
		
		Hamsi hamsi=new Hamsi(2, false, "mavi", 2, "karadeniz");
		System.out.println(hamsi.balýkýnfo());
		
		hamsi=new Hamsi(3, true, "kýrmýzý", 3, "marmara");
		System.out.println(hamsi.balýkýnfo());
		
		hamsi=new Hamsi(1, true, "kýrmýzý", 4, "karamarmara");
		System.out.println(hamsi.balýkýnfo(14,15.66));
		
	}

}
