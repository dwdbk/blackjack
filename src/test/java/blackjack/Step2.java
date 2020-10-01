package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class Step2 {

	@Test
	public void should_have_four_points_when_cards_are_two_and_two(){
		ICard firstCard = new Card("2");
		ICard secondCard = new Card("2");
		IHand hand = new Hand(firstCard, secondCard);
		assertEquals(4, hand.Points());
	}

	@Test
	public void should_have_fourteen_points_when_cards_are_eight_and_six(){
		ICard firstCard = new Card("8");
		ICard secondCard = new Card("6");
		IHand hand = new Hand(firstCard, secondCard);
		assertEquals(14, hand.Points());
	}
	
	@Test
	public void should_have_nineteen_points_when_cards_are_eight_and_six_and_five(){
		ICard firstCard = new Card("8");
		ICard secondCard = new Card("6");
		ICard thirdCard = new Card("5");
		IHand hand = new Hand(firstCard, secondCard);
		hand.AddCard(thirdCard);
		assertEquals(19, hand.Points());
	}
	
	@Test
	public void should_have_seventeen_points_when_cards_are_four_and_five_and_two_and_six(){
		ICard firstCard = new Card("4");
		ICard secondCard = new Card("5");
		ICard thirdCard = new Card("2");
		ICard fourthCard = new Card("6");
		IHand hand = new Hand(firstCard, secondCard);
		hand.AddCard(thirdCard);
		hand.AddCard(fourthCard);
		assertEquals(17, hand.Points());
	}

}
