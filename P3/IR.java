package P3;

// An instruction register (IR) is a Register which stores stores the current instruction to execute 
// IR can return the opcode and operand of the stored instruction.

public class IR extends Register {
	public IR(int value) {
		super(value);
	}
	public int getOpCode() {
		return getValue() / 100;
	}
	public int getOperand() {
		return getValue() % 100;
	}
}
