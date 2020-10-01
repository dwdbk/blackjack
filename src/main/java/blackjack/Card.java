package blackjack;

import java.util.Hashtable;

public class Card implements ICard{
	private String _Value;
	private final static Hashtable<String,Integer> _Card = new Hashtable<String,Integer>() {
	private static final long serialVersionUID = 1L;
	{
	    put("2",2);
	    put("3",3);
	    put("4",4);
	    put("5",5);
	    put("6",6);
	    put("7",7);
	    put("8",8);
	    put("9",9);
	    put("10",10);
	    put("J",10);
	    put("Q",10);
	    put("K",10);
	    put("A",11);
	 }};
	 
	 public Card(String value){
		 _Value = value;
	 }
	 
	 public int Points(){
		 return _Card.get(this._Value);
	 }

	@Override
	public boolean equals(Object obj) {

		return this._Value.equals(((Card)obj)._Value);
	}
}
