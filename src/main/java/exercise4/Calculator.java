/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise4;

public class Calculator {
	private int operand1;
	private int operand2;
	private int result;
		
	public int times() {
		result = operand1 * operand2;
		return result;
	}
	
	public int plus() {
		result = operand1 + operand2;
		return result;
	}

	public void operand1(int operand1) {
		this.operand1 = operand1;
	}

	public int operand1() {
		return operand1;
	}

	public void operand2(int operand2) {
		this.operand2 = operand2;
	}

	public int operand2() {
		return operand2;
	}

	public int result() {
		return result;
	}
}