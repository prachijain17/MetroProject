package Entities;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Card {

   
   private int cardId;
   private int cardBalance;
   private Map<Integer ,StationsTravelled> lastStations;
   static int count=0;
   
   public Card() {
		super();
		count++;
		cardId=count;
		cardBalance=100;
	}
   
   public int getCardId() {
	return cardId;
  }
   public void setCardId(int cardId) {
	this.cardId = cardId;
  }
   public int getCardBalance() {
	return cardBalance;
  }
   public void setCardBalance(int cardBalance) {
	this.cardBalance = cardBalance;
  }
   
   @Override
	public String toString() {
		return "Card [cardId=" + cardId + ", cardBalance=" + cardBalance + "]";
	}

   
}
