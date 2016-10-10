/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6;

public class EnterClients {

	private String clientName;
	private int phone;
	
	
	  public void setPhone(int phone) {
			this.phone = phone;
	  }
	
	  public int getPhone() {
			return phone;
	  }
	  
	  public void setClientName(String name) {
			this.clientName = name;
	  }
	  
	  public String getClientName() {
			return clientName;
	  }
	  
	  public boolean addClient() {
		  EnterRentalItems.rentalSystem.enterClient(getClientName(), getPhone());
		  return true;
	  }
}
