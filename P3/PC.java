package P3;

// A program counter is a Register that can be incremented by one. 
public class PC extends Register {
	public PC(int value) {
		super(value);
	}
	public void increment() {
		setValue(getValue()+1);;
	}
}
