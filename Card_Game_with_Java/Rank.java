package CardGame;

public enum Rank {

	ACE(1,"Ace"),DEUCE(2,"Deuce"),THREE(3, "3"),FOUR(4 ,"4"),FIVE(5, "5"),
	SIX(6, "6"),SEVEN(7, "7"),EIGHT(8, "8"),NINE(9, "9"),TEN(10, "10"),
	JACK(10, "Jack"),QUEEN(10, "Queen"),KING(10, "King");
	
	private final int rankValue;
	private final String rankString;
	
	//constructor
	private Rank(int rankValue,String rankString) {
		this.rankValue=rankValue;
		this.rankString=rankString;
	}
	
	public int getRank() {
		return rankValue;
	}
	
	public String printRank() {
		return rankString;
	}
}
