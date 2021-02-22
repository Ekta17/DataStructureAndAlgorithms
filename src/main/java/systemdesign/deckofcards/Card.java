package systemdesign.deckofcards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Card {
	private final Suit suit;
	private final Rank rank;
}
