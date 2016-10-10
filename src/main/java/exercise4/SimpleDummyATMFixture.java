/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise4;

public class SimpleDummyATMFixture {
	
	private int amount = 1000;
	
	public void enterCardWithNumberAndEnterPinNumber(int card, int pin) {
		
	}
	
	public boolean pinCorrect() {
		return true;
	}
	
	public int creditAmountIs() {
		return amount;
	}
	
	public void selectAmountOfEuro(int aAmount) {
		this.amount = 0;
	}
	
	public void selectReceipt() {
		
	}
	
	public boolean cardNumberPinNumber(int card, int pin) {
		if( card == 1234 && pin == 4321 )
			return true;
		
		return false;
	}
	
	public void confirmTransaction() {
		
	}
	
	public int amountEmittedIs() {
		return 50;
	}
	
	public String receipt() {
		return "You just got skimmed!";
	}
	
}
