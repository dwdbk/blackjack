package blackjack;

import java.util.ArrayList;

public class Hand implements IHand {
	private ArrayList<ICard> _Cards = new ArrayList<ICard>();
	
	public Hand(ICard firstCard, ICard secondCard){
		_Cards.add(firstCard);
		_Cards.add(secondCard);
	}
	
	public int Points() {
		int sum = 0;
		for (ICard card : _Cards) {
			sum += card.Points();
			if (sum > 21 && _Cards.contains(new Card("A")))
				sum -= 10;

		}
		return sum;
	}

	public boolean IsBusted() {
		return Points() > 21;
	}

	public boolean IsBlackjack() {
		return this._Cards.size() == 2 && Points() == 21;
	}

	public void AddCard(ICard card) {
		this._Cards.add(card);
	}
}
