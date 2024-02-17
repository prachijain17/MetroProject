package Entities;

public class User {

	static int count=0;
	private int userId;
	private String userName;
    private Card card;
	
	public User() {
		
	}

	public User( String userName) {
		super();
		count++;
		this.userId = count;
		this.userName = userName;
		card=new Card();
		
	}

	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userCardId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

//User has a card
	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", card=" + card + "]";
	}
	

}
