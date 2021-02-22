package systemdesign.deckofcards;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@ToString
@Getter
public class Deck {
	private static final int NUMBER_OF_CARDS = 52;

	private List<Card> cards;

	Deck() {
		this.cards = createDeckOfCards();
	}

	private List<Card> createDeckOfCards() {
		List<Card> newDeckOfCards = new ArrayList<>(NUMBER_OF_CARDS);
		for (Rank r : EnumSet.allOf(Rank.class)) {
			for (Suit s : EnumSet.allOf(Suit.class)) {
				newDeckOfCards.add(new Card(s, r));
			}
		}
		return newDeckOfCards;
	}

}
