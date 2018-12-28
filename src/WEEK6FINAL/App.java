/**
 * 2.Create a class called App with a main method.
3.Instantiate a Deck and two Players, call the shuffle method on the deck.
4.Using a traditional for loop, iterate 52 times calling
the Draw method on the other player each iteration
 using the Deck you instantiated.
5.Using a traditional for loop, iterate 26 times and call the flip method for each player.
a.Compare the value of each card returned by the two player’s flip methods. Call the incrementScore 
method on the player whose card has the higher value.
6.After the loop, compare the final score from each player. 
7.Print the final score of each player and either “Player 1”, 
“Player 2”, or “Draw” depending on which score is higher or if they are both the same.
 */
package WEEK6FINAL;

public class App {

	public static void main(String[] args) {
			
		Deck myDeck = new Deck();
		Player player1 = new Player("Alex");
		Player player2 = new Player ("Malcom");
		
		
		for(int i = 0; i < 26; i++) {
			player1.draw(myDeck);
			player2.draw(myDeck);
			
		}
		
		System.out.println(player1.getName());
		System.out.println("---------------------");
		player1.checkHand();
		
		
		System.out.println(player2.getName());
		System.out.println("---------------------");
		player2.checkHand();
		
		
		
	}

}
