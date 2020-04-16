package polimo1;

public class Ucgen extends Dortgen {

	float kenar3;
	
	public Ucgen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ucgen(float kenar1, float kenar2) {
		super(kenar1, kenar2);
		// TODO Auto-generated constructor stub
	}
	
	

	public Ucgen(float kenar1, float kenar2, float kenar3) {
		super(kenar1, kenar2);
		this.kenar3 = kenar3;
	}

	@Override
	protected float Alan() {
		System.out.println("ücgen sınıfı alan hesaplama");
		return (this.kenar1*this.kenar2)/2;
	}
}
