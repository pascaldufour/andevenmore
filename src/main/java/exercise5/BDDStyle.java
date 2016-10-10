/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise5;

public class BDDStyle {

	int dollarsInCredit = 0;
	int dollarsInDispenser = 0;
	boolean cashDispensed;
	
	public void dollarsInCredit(int dollars) {
		this.dollarsInCredit = dollars;
	}
	
	public void dollarsInDispenser(int dollars) {
		this.dollarsInDispenser = dollars;
	}
	
	public void requestDollars(int requestedDollars) {
		if(requestedDollars <= dollarsInCredit)
		{
			dollarsInCredit -= requestedDollars;
			this.dollarsInDispenser -= requestedDollars;
			cashDispensed = true;
		}
	}
	
	public int accountSaldo() {
		return dollarsInCredit;
	}
	
	public boolean cashDispensed() {
		return cashDispensed;
	}
	
	public int dispenserAmount() {
		return this.dollarsInDispenser;
	}
}
