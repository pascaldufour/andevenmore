/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class RentalSystem {

	private RentalRepository rentalRepository;
	private String currentClientName;
	private Dictionary<String, Dictionary<String, HiredItem>> rentalLists = new Hashtable<String, Dictionary<String, HiredItem>>();
	
	public RentalSystem(RentalRepository aRentalRepository) {
		assert (aRentalRepository != null);
		
		this.rentalRepository = aRentalRepository;
	}

	public void setRentalRepository(RentalRepository aRentalRepository) {
		assert (aRentalRepository != null);
		
		this.rentalRepository = aRentalRepository;
	}
		
	public void enterClient(String name, int phoneNumber) {
		assert (name != null);
		
		if(clientNotExists(name)) {		
			rentalLists.put(name, new Hashtable<String, HiredItem>());
		}
	}
	
	private boolean clientNotExists(String name) {
		return rentalLists.get(name) == null;
	}

	public void hireItem(String clientName, int numberOfItems, String itemName, int durationInDays) {
		assert(clientName != null) && (itemName !=null) && (numberOfItems >= 0) && (durationInDays >=0 );
		
		currentClientName = clientName;
		double costPerDay = costPerDay(itemName);
		HiredItem rentedItem = HiredItem.create(itemName, numberOfItems, durationInDays, costPerDay);	
		Dictionary<String, HiredItem> clientRentalList = clientRentalList();
		clientRentalList.put(itemName, rentedItem);
	}

	private double costPerDay(String itemName) {
		RentalItem rentalItem = rentalRepository.find(itemName);
		return rentalItem.costPerDay();
	}

	private Dictionary<String, HiredItem> clientRentalList() {
		Dictionary<String, HiredItem> clientRentalList = rentalLists.get(currentClientName);
		return clientRentalList;
	}
	
	public void returnItem(int numberOfItems, String itemName) {
		assert(numberOfItems >=0) && (itemName != null);
		
		Dictionary<String, HiredItem> clientRentalList = clientRentalList();
		clientRentalList.remove(itemName);
	}
	
	public int costs(CostCalculator costCalculator) {
		return costCalculator.calculate(clientRentalList().elements());
	}
	
	public Enumeration<HiredItem> rentalList(String clientName) {
		assert(clientName != null);
		
		Dictionary<String, HiredItem> clientRentalList = rentalLists.get(clientName);
		return clientRentalList.elements();
	}
	
}
