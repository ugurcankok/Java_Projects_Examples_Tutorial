package overloading;

public class Hamsi extends Bal�k {
	
	private String t�r;
	
	

	public Hamsi() {
		super();
	
	}



	public Hamsi(int life, boolean goc, String renk, int yumurtlama) {
		super(life, goc, renk, yumurtlama);
	
	}

	

	public Hamsi(int life, boolean goc, String renk, int yumurtlama, String t�r) {
		super(life, goc, renk, yumurtlama);
		this.t�r = t�r;
	}

//kendine ait methodu olabilir.
	
	@Override
	protected String bal�k�nfo() {
		
		return super.bal�k�nfo()+"ortal�k �enlensin!!:) T�r�:"+this.t�r+"\n";
	}
	
	@Override
	protected String bal�k�nfo(int uzunluk,double ag�rl�k) {
		
		return super.bal�k�nfo(uzunluk,ag�rl�k)+"ortal�k �enlensin!!:) T�r�:"+this.t�r+"\n";
	}
	


}
