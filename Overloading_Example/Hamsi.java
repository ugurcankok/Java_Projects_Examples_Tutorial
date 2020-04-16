package overloading;

public class Hamsi extends Balýk {
	
	private String tür;
	
	

	public Hamsi() {
		super();
	
	}



	public Hamsi(int life, boolean goc, String renk, int yumurtlama) {
		super(life, goc, renk, yumurtlama);
	
	}

	

	public Hamsi(int life, boolean goc, String renk, int yumurtlama, String tür) {
		super(life, goc, renk, yumurtlama);
		this.tür = tür;
	}

//kendine ait methodu olabilir.
	
	@Override
	protected String balýkýnfo() {
		
		return super.balýkýnfo()+"ortalýk þenlensin!!:) Türü:"+this.tür+"\n";
	}
	
	@Override
	protected String balýkýnfo(int uzunluk,double agýrlýk) {
		
		return super.balýkýnfo(uzunluk,agýrlýk)+"ortalýk þenlensin!!:) Türü:"+this.tür+"\n";
	}
	


}
