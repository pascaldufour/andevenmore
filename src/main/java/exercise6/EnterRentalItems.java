/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6;

import exercise6.domain.RentalItem;
import exercise6.domain.RentalRepository;
import exercise6.domain.RentalSystem;
import exercise6.domain.impl.SimpleRentalRepository;

public class EnterRentalItems {
	private String itemName;
	private double costPerDay;
	private int numberOfItems;
	private int phone;
	private String clientName;

	public static RentalRepository rentalRepository = new SimpleRentalRepository();
	public static RentalSystem rentalSystem = new RentalSystem(rentalRepository);
	
	public boolean addItem() {
		for(int i=0; i<numberOfItems; i++) {
			rentalRepository.store(RentalItem.create(this.itemName,this.costPerDay));
		}
		return true;
	}
	  
	  public void setItemName(String name) {
		  this.itemName = name;
	  }
	  
	  public void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;  
	  }
	  
	  public void setCount(int numberOfItems) {
		  this.numberOfItems = numberOfItems;
	  }
	  

}
