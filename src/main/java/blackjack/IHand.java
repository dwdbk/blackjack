package blackjack;

public interface IHand {
	
	public int Points();
	
	public boolean IsBusted();
	
	public boolean IsBlackjack();
	
	public void AddCard(ICard card);
	
}
