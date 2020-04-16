package inheritance;

public class BabaSInıf {

	double s1,s2;
	
	public BabaSInıf(double s1, double s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}


	public double getS1() {
		return s1;
	}


	public void setS1(double s1) {
		this.s1 = s1;
	}



	public double getS2() {
		return s2;
	}


	public void setS2(double s2) {
		this.s2 = s2;
	}
class EvlatSınıf extends BabaSInıf{
	int s3;

	public EvlatSınıf(double s1, double s2, int s3) {
		super(s1, s2);
		this.s3 = s3;
	}
	
	
}
	public static void main(String[] args) {
		

	}

}
