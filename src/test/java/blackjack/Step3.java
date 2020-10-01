package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class Step3 {

	@Test
	public void should_have_blackjack_when_cards_are_ace_and_ten(){
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("10");
		IHand hand = new Hand(firstCard, secondCard);
		assertEquals(21, hand.Points());
		assertTrue(hand.IsBlackjack()); 
		assertFalse(hand.IsBusted());
	}

	@Test
	public void should_not_have_blackjack_when_cards_are_ace_and_six_and_four(){
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("6");
		ICard thirdCard = new Card("4");
		IHand hand = new Hand(firstCard, secondCard);
		hand.AddCard(thirdCard);
		assertEquals(21, hand.Points());
		assertFalse(hand.IsBlackjack());
		assertFalse(hand.IsBusted());
	}

	@Test
	public void should_not_have_blackjack_when_cards_are_ace_and_eight(){
		ICard firstCard = new Card("A");
		ICard secondCard = new Card("8");
		IHand hand = new Hand(firstCard, secondCard);
		assertEquals(19, hand.Points());
		assertFalse(hand.IsBlackjack());
		assertFalse(hand.IsBusted());
	}

	@Test
	public void should_be_busted_when_score_goes_above_21(){
		ICard firstCard = new Card("10");
		ICard secondCard = new Card("10");
		ICard thirdCard = new Card("2");
		IHand hand = new Hand(firstCard, secondCard);
		hand.AddCard(thirdCard);
		assertFalse(hand.IsBlackjack());
		assertTrue(hand.IsBusted());
	}
	
}
