package CardGame;

public class Card {

	private Suit suit;
	private Rank rank;
	public boolean isFaceUp;
	
	//constructor
	public Card (Rank rank,Suit suit) {
		this.rank=rank;
		this.suit=suit;
		isFaceUp=true;
	}
	
	
	public String getSuit() {
		return suit.printSuit();
	}
	public String printRank() {
		//get rank as  a string 
		return rank.printRank();
	}
	public int getRank() {
		return rank.getRank();
	}
	
	public void flipCard() {
		isFaceUp = !isFaceUp; //reverse the value of isFaceup
	}
	public String toString() {
		String str="";
		
		if(isFaceUp) {
			str += rank.printRank() + " of " + suit.printSuit();
		}else {
			str="Face Down (nothing to see here)";
		}
		
		return str;
	}
}
