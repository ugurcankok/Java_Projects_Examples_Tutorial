package polimo1;

public abstract class sekil {

	float kenar1,kenar2;

	public sekil() {
		super();
	
	}
	
	
	
	public sekil(float kenar1, float kenar2) {
		super();
		this.kenar1 = kenar1;
		this.kenar2 = kenar2;
	}



	protected abstract float Alan() ;//zorlama i�in kullan�l�r genelde abstract
	
	protected void yaz() {
		System.out.println("merhaba");
	}
	
	protected String yaz1() {
		return "hola";
	}
}
