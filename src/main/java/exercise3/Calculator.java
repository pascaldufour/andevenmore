/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise3;

public class Calculator {
	private int operand1;
	private int operand2;
	private int result;
	
	public void setOperator(String operator) {
		if("plus".equals(operator))
			result = (getOperand1() + getOperand2());
		else if("times".equals(operator))
			result = (getOperand1() * getOperand2());
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public int getOperand1() {
		return operand1;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}

	public int getOperand2() {
		return operand2;
	}

	public int result() {
		return result;
	}
}
