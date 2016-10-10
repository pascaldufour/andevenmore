/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain.impl;

import java.util.Dictionary;
import java.util.Hashtable;

import exercise6.domain.RentalItem;
import exercise6.domain.RentalRepository;


public class SimpleRentalRepository implements RentalRepository{

	Dictionary<String,RentalItem> rentalItems = new Hashtable<String, RentalItem>();
	@Override
	public RentalItem find(String itemName) {
		return rentalItems.get(itemName);
	}

	@Override
	public void store(RentalItem rentalItem) {
		rentalItems.put(rentalItem.getName(), rentalItem);
	}

}
