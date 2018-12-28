/**
 * 1.Create the following classes.
a.Card
i.Fields
1.value (contains a value from 2-14 representing cards 2-Ace)
2.name (e.g. Ace of Diamonds, or Two of Hearts)
ii.Methods
1.Getters and Setters
2.describe (prints out information about a card)
 */


package WEEK6FINAL;

public class Card {
	
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	
	
	
	//@Overrride
	public String toString() {
		return "Name: " + name + " - Value: " + value;
	}
	
	
	
	
	
	
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
