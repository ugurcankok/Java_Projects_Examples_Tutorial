package EnumEx;

public class Enumex {
	
	public enum Season{
		SPRING,WINTER,FALL,SUMMER
	}
	
	public class Season2{
		
		public static final int SPRING = 0;
		public static final int WINTER = 1;
		public static final int FALL = 2;
		public static final int SUMMER = 3;
	}
	
	@Override
	public String toString() {
		String constName=super.toString();
		return constName.substring(0, 1) + constName.substring(1).toLowerCase();
	}

	public static void main(String[] args) {
		
		Season season=Season.FALL;
		System.out.println(season);
		
		for(Season item: Season.values()) {
			System.out.print(item + " " );
		}

	}

}
