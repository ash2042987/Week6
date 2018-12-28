/**
*1.
* b.Deck
i.Fields
1.cards (List of Card)
ii.Methods
1.shuffle (randomizes the order of the cards)
2.draw (removes and returns the top card of the Cards field)
In the constructor, when a new Deck is instantiated, the Cards
 field should
 be populated with the standard 52 cards.
 */

package WEEK6FINAL;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Deck {

	private static List<Card> cards;
	 
	
	public Deck() {
		cards = new ArrayList<Card>();
		for (int i = 0; i < 4; i++) {
			for (int x = 2; x < 15; x++){
				cards.add(new Card(x, createCardName(i, x)));
	}
		
		
		}
		shuffle();
	}
	
	
	
	public static void shuffle()
	  {
	    
	   Collections.shuffle(cards);
	  }
	
	public Card draw() {
		return cards.remove(0);
		
	}
	
	
	
	private String createCardName(int suit, int value) {
		StringBuilder cardName = new StringBuilder();
		cardName.append(determineValueString(value));
		cardName.append(" of ");
		cardName.append(determineSuitString(suit));
		return cardName.toString();
	
}
	private String determineSuitString(int suit) {
		String result = "";
		switch (suit) {
			case 0:
				result = "Heart";
				break;
			case 1:
				result = "Spade";
				break;
			case 2:
				result = "Diamond";
				break;
			case 3:
				result = "Club";
				break;
			default:
				result = "Default";
			
			
			}
			return result;
		}
	
	
	private String determineValueString(int value) {
		String result = "";
		switch (value) {
			case 11:
				result ="Jack";
				break;
			case 12:
				result = "Queen";
				break;
			case 13:
				result = "King";
				break;
			case 14:
				result = "Ace";
				break;
			default:
				result = "" + value;
			
		}
		return result;
	}
	}
