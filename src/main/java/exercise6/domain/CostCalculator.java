/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain;

import java.util.Enumeration;

public interface CostCalculator {
	public int calculate(Enumeration<HiredItem> clientRentalList);
}