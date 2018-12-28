/**
 *3.
 * c.Player
i.Fields
1.hand (List of Card)
2.score (set to 0 in the constructor)
3.name
ii.Methods
1.describe (prints out information about the player and 
calls the describe method for each card in the Hand List)
2.flip (removes and returns the top card of the Hand)
3.draw (takes a Deck as an argument and calls the draw method
 on the deck, adding the returned Card to the hand field)
4.incrementScore (adds 1 to the Player’s score field)
 */
package WEEK6FINAL;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	
	public Player(String name) {
		hand = new ArrayList<Card>();
		this.name = name;
	}
	
	public void checkHand() {
		for (Card card : hand) {
			System.out.println(card.toString());
		}
	}
	
	public boolean discard(Card card) {
		return hand.remove(card);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	

	
	@Override
	public String toString() {
		return "Name: " + name + "Score: " + score;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
