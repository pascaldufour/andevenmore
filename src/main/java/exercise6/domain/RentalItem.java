/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain;

public class RentalItem {

	private String name;
	private double costPerDay;

	public static RentalItem create(String name, double costPerDay2) {
		return new RentalItem(name, costPerDay2);
	}
	
	private RentalItem(String name, double costPerDay2) {
		this.name = name;
		this.costPerDay = costPerDay2;
	}
	
	public double costPerDay() {
		return this.costPerDay;
	}

	public String getName() {
		return this.name;
	}

}
