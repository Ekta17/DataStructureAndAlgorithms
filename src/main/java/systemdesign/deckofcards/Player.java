package systemdesign.deckofcards;

import exception.NoCardsLeftException;

import java.util.Collections;
import java.util.Optional;

public class Player {
	private Deck deckOfCards;

	Player(){
		deckOfCards = new Deck();
	}

	public void shuffleDeck(){
		Collections.shuffle(this.deckOfCards.getCards());
	}

	public Optional<Card> getTopCard(){
		try{
			return Optional.of(pop());
		}catch (NoCardsLeftException exception){
			System.out.println(exception.getMessage());
			return Optional.empty();
		}
	}

	public boolean isEmpty() {
		return this.deckOfCards.getCards().isEmpty();
	}

	public Card pop() throws NoCardsLeftException {
		if (isEmpty())
			throw new NoCardsLeftException("No cards left in the Deck");
		else
			return this.deckOfCards.getCards().get(this.deckOfCards.getCards().size() - 1);
	}

	public int getNumberOfCardsRemaining(){
		return this.deckOfCards.getCards().size();
	}
}
