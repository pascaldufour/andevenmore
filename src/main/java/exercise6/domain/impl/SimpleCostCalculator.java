/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain.impl;

import java.util.Enumeration;

import exercise6.domain.CostCalculator;
import exercise6.domain.HiredItem;
import exercise6.domain.RentalItem;
import exercise6.domain.RentalRepository;


public class SimpleCostCalculator implements CostCalculator {

	
	public int calculate(Enumeration<HiredItem> clientRentalList) {
		int costs = 0;
		
		while(clientRentalList.hasMoreElements()) {
			HiredItem rentedItem = clientRentalList.nextElement();
			costs += rentedItem.hireCosts();
			
		}
		return costs;
	}
}