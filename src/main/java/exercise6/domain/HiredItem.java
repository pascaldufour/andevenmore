/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain;

public class HiredItem {

	public final String itemName;
	public final int numberOfItems;
	public final int durationInDays;
	private double costPerDay;

	private HiredItem(String itemName, int numberOfItems, int durationInDays, double costPerDay) {
		this.itemName = itemName;
		this.numberOfItems = numberOfItems;
		this.durationInDays = durationInDays;
		this.costPerDay = costPerDay;
	}

	public static HiredItem create(String itemName, int numberOfItems,
			int durationInDays, double costPerDay) {
		return new HiredItem(itemName, numberOfItems, durationInDays, costPerDay);
	}

	public double hireCosts() {
		return costPerDay * numberOfItems * durationInDays;
	}

}
