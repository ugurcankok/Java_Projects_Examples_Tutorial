package polimo1;

public class Dortgen extends sekil {

	public Dortgen() {
		super();
		
	}

	public Dortgen(float kenar1, float kenar2) {
		super(kenar1, kenar2);
		
	}

	@Override
	protected float Alan() {
		System.out.println("dörtgen sınıfı alan hesaplama");
		return this.kenar1*this.kenar2;
	}
	
}
