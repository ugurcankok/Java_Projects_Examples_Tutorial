package CardGame;
import java.util.Random;

public class Deck extends Hand{
	Random rand=new Random();
	
	public void  populate() {
		
		for(Suit suit:Suit.values()) {
			for(Rank rank:Rank.values()) {
				Card card=new Card(rank,suit);
				card.flipCard();
				this.add(card);
			}
		}
	}
	
	public void shuffle() {
		for(int i=cards.size()-1;i>0;i--) {
			//swap a random card between the beginning and last card of the loop
			int pick=rand.nextInt(i);
			Card randCard=cards.get(pick);
			Card lastCard=cards.get(i);
			cards.set(i, randCard);
			cards.set(pick, lastCard);
		}
	}
	
	//multiple hand
	public void deal(Hand [] hands,int perHand) {
		for(int i=0;i<perHand;i++) {
			for(int j=0;j<hands.length;j++) {
				this.give(cards.get(0), hands[j]);
			}
		}
	}
	
	
	//single hand
	public void deal(Hand hand, int perHand) {
		for(int i=0;i<perHand;i++) {
			this.give(cards.get(0), hand);
		}
	}
	
	public void flipCard(Card c) {
		c.flipCard();
	}
	
	
}
