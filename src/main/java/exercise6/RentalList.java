/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import exercise6.domain.HiredItem;

public class RentalList {
	
	private String clientName;

	public RentalList(String clientName) {
		this.clientName = clientName;
	}
	
	public List<Object> query() {
		
		Enumeration<HiredItem> rentalList = EnterRentalItems.rentalSystem.rentalList(clientName);
		List<Object> result = new ArrayList<Object>();
		
		while(rentalList.hasMoreElements()) {
			HiredItem item = rentalList.nextElement();
			List<Object> row = new ArrayList<Object>();
			row.add( new ArrayList<Object>(Arrays.asList("Rental Item", item.itemName)) );
			row.add( new ArrayList<Object>(Arrays.asList("Client", clientName)) );
			row.add( new ArrayList<Object>(Arrays.asList("Count", String.valueOf(item.numberOfItems))) );
			row.add( new ArrayList<Object>(Arrays.asList("Days", String.valueOf(item.durationInDays))) );
			
			result.add(row);
		}
		
		return result;
	}
}
