package CardGame;

import java.util.ArrayList;

public class Hand {
	
	public ArrayList<Card> cards;
	
	//constructor
	public Hand() {
		cards=new ArrayList<Card> ();
	}
	
	public void clear() {
		cards.clear();
	}
	
	public void add(Card card) {
		cards.add(card);
	}
	
	public String showHand() {
		/* Show card and their total points, but only show total points if ALL card are face up*/
		String str="";
		boolean allFaceup= true;
		
		for(Card c:cards) {
			str+=c.toString() + "\n";
			if(!c.isFaceUp) {
				allFaceup=false;
			}
		}
		//if all cards are face up, show total
		if(allFaceup) {
			str+="Total points =" + getTotal() + "\n";
		}
		return str;
	}
	
	public void flipCards() {
		for(Card c:cards) {
			c.flipCard();
		}
	}
	
	public boolean give(Card card,Hand otherhand) {
		if(!cards.contains(card)) {
			return false;
		}else {
			
			cards.remove(card);
			otherhand.add(card);
			return true;
		}
	}
	
	//return the total points of a hand
	public int getTotal() {
		int totalPts=0;
		boolean hasAce=false;
		//getting total points (any aces by default will be worth 1)
		for(int i=0;i<cards.size();i++) {
			totalPts+=cards.get(i).getRank();
			//check the see if the card is an Ace
			if(cards.get(i).printRank()=="Ace") {
				hasAce=true;
			}
			// make the ace worth 11 if total points less than or equal to 11
			if(hasAce && totalPts<=11) {
				totalPts+=10;//add ten more to the Ace		
			}
		}
		
		return totalPts;
	}

}
