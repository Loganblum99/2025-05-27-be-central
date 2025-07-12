package week06;

public class App {

	public static void main(String[] args) {
		//new deck object
		Deck deck = new Deck();
		//2 new player objects
		Player player1 = new Player("Logan");
		Player player2 = new Player("Justin");
		//shuffle method from deck class
		deck.shuffle();
		//loop to draw each player a card
		for(int i = 0; i < 52; i++) {
			if(i % 2 != 0) {
				player1.draw(deck);
			}
			if(i % 2 ==0) {
				player2.draw(deck);
			}
		}
		//loop to flips the top card for each player and compare them to each other and announce the winner of the round
		for(int i = 0; i < 26; i++) {
			//flip call for player 1 while also printing the name of the card
			Card p1 = player1.flip();
			System.out.println(player1.getName());
			p1.describe();
			int c1 = p1.getValue();
			//flip call for player 2 while also printing the name of the card
			Card p2 = player2.flip();
			System.out.println(player2.getName());
			p2.describe();
			int c2 = p2.getValue();
			//if/else statement to check which player won the round
			if(c1 > c2) {
				player1.incrementScore();
				System.out.println(player1.getName() + " wins this round");
			}else {
				player2.incrementScore();
				System.out.println(player2.getName() + " wins this round");
			}
			System.out.println(player1.getName() + ": " + player1.getScore());
			System.out.println(player2.getName() + ": " + player2.getScore());
			System.out.println("------------------------");
		}
		System.out.println("Final Score");
		System.out.println(player1.getName() + ": " + player1.getScore());
		System.out.println(player2.getName() + ": " + player2.getScore());
		if(player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " WINS!!!!");
		}else
		if(player1.getScore() < player2.getScore()) {
		System.out.println(player2.getName() + " WINS!!!!");
		}else {
			System.out.println("It's a draw");
		}
	}
}




