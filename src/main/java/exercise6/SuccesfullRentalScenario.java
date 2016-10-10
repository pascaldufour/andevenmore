/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6;

import exercise6.domain.impl.*;

public class SuccesfullRentalScenario {

	public void clientHiresOfForDays(String clientName, int numberOfItems, String itemName, int durationInDays) {
		EnterRentalItems.rentalSystem.hireItem(clientName, numberOfItems, itemName, durationInDays);
	}
	
	public int costs() {
		return EnterRentalItems.rentalSystem.costs(new SimpleCostCalculator());
	}
}
