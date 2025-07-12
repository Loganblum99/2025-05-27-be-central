package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	String name;
	Player(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public int getScore() {
		return score;
	}
	public void describe() {
		System.out.println(name);
		for(Card hands : hand) {
			hands.describe();
		}
		System.out.println("Score is: " + score);
	}
	public Card flip() {
		Card top = hand.get(0);
		hand.remove(0);
		return top;
	}
	public void draw(Deck deck) {
		Card card = deck.draw();
		hand.add(card);;
		
	}
	public void incrementScore() {
		this.score++;
	}
	 
}
