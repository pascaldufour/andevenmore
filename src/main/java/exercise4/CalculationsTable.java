/**
 * copyright AgiliX Agile Development Consulting BV
 * Author | Cesario Ramos
 **/

package exercise4;

public class CalculationsTable {

	
	private Calculator calculator = new Calculator();
	
	public void setOperator(String operator) {
		if("plus".equals(operator))
			calculator.plus();
		else if("times".equals(operator))
			calculator.times();
	}

	public void setOperand1(int operand1) {
		calculator.operand1(operand1);
	}

	public void setOperand2(int operand2) {
		calculator.operand2(operand2);
	}

	public int result() {
		return calculator.result();
	}
}
