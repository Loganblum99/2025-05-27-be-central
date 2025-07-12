package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public List<Card> cards = new ArrayList<Card>();
	
	Deck() {
	
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] num = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for(String suit : suits) {
			int i = 2;
			for(String nums : num) {
				cards.add(new Card(nums, suit, i));
				i++;
			}
		}	
	}
	
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	public void describe() {
		for(Card card : this.cards) {
			card.describe();
		}
	}
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Card draw() {
		Card card = this.cards.get(0);
		cards.remove(card);
		return card;
	}
}

