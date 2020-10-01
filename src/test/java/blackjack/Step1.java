package blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class Step1 {

	@Test	        
	public void should_value_two_when_card_displays_two(){
		ICard card = new Card("2");
		assertEquals(2, card.Points());
	}
	
	@Test	        
	public void should_value_seven_when_card_displays_seven(){
		ICard card = new Card("7");
		assertEquals(7, card.Points());
	}
	
	@Test	        
	public void should_value_ten_when_card_displays_ten(){
		ICard card = new Card("10");
		assertEquals(10, card.Points());
	}
	
	@Test	        
	public void should_value_ten_when_card_displays_jack(){
		ICard card = new Card("J");
		assertEquals(10, card.Points());
	}
	
	@Test	        
	public void should_value_ten_when_card_displays_queen(){
		ICard card = new Card("Q");
		assertEquals(10, card.Points());
	}
	
	@Test	        
	public void should_value_ten_when_card_displays_king(){
		ICard card = new Card("K");
		assertEquals(10, card.Points());
	}
	
	@Test	        
	public void should_value_eleven_when_card_displays_ace(){
		ICard card = new Card("A");
		assertEquals(11, card.Points());
	}

}
