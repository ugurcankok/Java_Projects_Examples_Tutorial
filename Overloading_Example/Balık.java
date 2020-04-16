package overloading;

public class Balýk {

	private int life;
	private boolean goc;
	private String renk;
	private int yumurtlama;
	
	public Balýk() {
		super();
		
	}
	
	

	public Balýk(int life, boolean goc, String renk, int yumurtlama) {
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
	

protected String balýkýnfo() {
		
		String gocDurum,mevsim;
		
		if(this.goc==false) {
			gocDurum="göcmüyor";
		}else {
			gocDurum="göcer";
		}
		
		switch(this.yumurtlama) {
		case 1:mevsim="ilkbahar";break;
		case 2:mevsim="yaz";break;
		case 3:mevsim="sonbahar";break;
		case 4:mevsim="kýþ";break;
		default :mevsim="kýþ";break;
		}
		
		String sonuc=" goc:"+gocDurum+
				" rengi:"+this.renk+
				" omrü:"+this.life+
				" yumurtlama mevsimi :"+mevsim+"\n";
		
		return sonuc;
	}

	
//overloading
protected String balýkýnfo(int uzunluk,double agýrlýk) {
		
		String gocDurum,mevsim;
		
		if(this.goc==false) {
			gocDurum="göcmüyor";
		}else {
			gocDurum="göcer";
		}
		
		switch(this.yumurtlama) {
		case 1:mevsim="ilkbahar";break;
		case 2:mevsim="yaz";break;
		case 3:mevsim="sonbahar";break;
		case 4:mevsim="kýþ";break;
		default :mevsim="kýþ";break;
		}
		
		String sonuc="\n goc:"+gocDurum+
				"\n rengi:"+this.renk+
				"\n omrü:"+this.life+
				"\n yumurtlama mevsimi :"+mevsim+
				"\n Agýrlýk"+agýrlýk+
				"\n Uzunluk"+uzunluk+
				"\n";
		
		return sonuc;
	}


}
