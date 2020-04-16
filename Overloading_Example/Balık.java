package overloading;

public class Bal�k {

	private int life;
	private boolean goc;
	private String renk;
	private int yumurtlama;
	
	public Bal�k() {
		super();
		
	}
	
	

	public Bal�k(int life, boolean goc, String renk, int yumurtlama) {
		super();
		this.life = life;
		this.goc = goc;
		this.renk = renk;
		this.yumurtlama = yumurtlama;
	}


	

	public int getLife() {
		return life;
	}



	public void setLife(int life) {
		this.life = life;
	}



	public boolean isGoc() {
		return goc;
	}



	public void setGoc(boolean goc) {
		this.goc = goc;
	}



	public String getRenk() {
		return renk;
	}



	public void setRenk(String renk) {
		this.renk = renk;
	}



	public int getYumurtlama() {
		return yumurtlama;
	}



public void setYumurtlama(int yumurtlama) {
		this.yumurtlama = yumurtlama;
	}
	

protected String bal�k�nfo() {
		
		String gocDurum,mevsim;
		
		if(this.goc==false) {
			gocDurum="g�cm�yor";
		}else {
			gocDurum="g�cer";
		}
		
		switch(this.yumurtlama) {
		case 1:mevsim="ilkbahar";break;
		case 2:mevsim="yaz";break;
		case 3:mevsim="sonbahar";break;
		case 4:mevsim="k��";break;
		default :mevsim="k��";break;
		}
		
		String sonuc=" goc:"+gocDurum+
				" rengi:"+this.renk+
				" omr�:"+this.life+
				" yumurtlama mevsimi :"+mevsim+"\n";
		
		return sonuc;
	}

	
//overloading
protected String bal�k�nfo(int uzunluk,double ag�rl�k) {
		
		String gocDurum,mevsim;
		
		if(this.goc==false) {
			gocDurum="g�cm�yor";
		}else {
			gocDurum="g�cer";
		}
		
		switch(this.yumurtlama) {
		case 1:mevsim="ilkbahar";break;
		case 2:mevsim="yaz";break;
		case 3:mevsim="sonbahar";break;
		case 4:mevsim="k��";break;
		default :mevsim="k��";break;
		}
		
		String sonuc="\n goc:"+gocDurum+
				"\n rengi:"+this.renk+
				"\n omr�:"+this.life+
				"\n yumurtlama mevsimi :"+mevsim+
				"\n Ag�rl�k"+ag�rl�k+
				"\n Uzunluk"+uzunluk+
				"\n";
		
		return sonuc;
	}


}
