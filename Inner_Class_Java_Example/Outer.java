
public class Outer {
	
	private int a=30;
	
	class Inner {
		public void message() {
			System.out.println("a= " + a);
		}
	}

	public static void main(String[] args) {
		
		Outer out=new Outer();
		Outer.Inner inner=out.new Inner();
		
		inner.message();

	}

}
