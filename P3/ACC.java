package P3;

public class ACC extends Register {
	//constructor
	public ACC(int value) {
		super(value);
	}
	//methods
	public void add(int value2) {
		setValue(getValue() + value2);
	}
	public void sub(int value2) {
		setValue(getValue() - value2);
	}
	public void mult(int value2) {
		setValue(getValue() * value2);
	}
	public void div(int value2) {
		setValue(getValue() / value2);
	}
}
