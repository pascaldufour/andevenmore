/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain;

public interface RentalRepository {

	public RentalItem find(String itemName);
	public void store(RentalItem rentalItem);
}
