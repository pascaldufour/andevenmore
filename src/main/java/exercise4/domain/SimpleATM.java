package exercise4.domain;

public class SimpleATM {

	private int cardNumber;
	private int currentBalance = 1000;
	private int selectedAmount;

	public boolean pinCorrect(int pin) {
		if( cardNumber == 1234 && pin == 4321 )
			return true;
		
		return false;	}
	
	public void enterCard(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public void selectAmount(int aAmount) {
		this.selectedAmount = aAmount;
	}
	
	public int currentBalance() {
		return this.currentBalance;
	}
	
	public void withdraw() {
		
	}
}
