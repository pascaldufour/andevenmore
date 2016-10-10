/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise6.domain;

public class Client {

	private int phoneNumber;
	private String name;

	public Client(String name, int phoneNumber) {
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
	}

	public static Client create(String name, int phoneNumber) {
		return new Client(name, phoneNumber);
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
