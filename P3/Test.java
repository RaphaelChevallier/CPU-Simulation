package P3;

public class Test {

	public static void main(String[] args) {
		//test PC
		PC pc = new PC(0);
		pc.increment();
		Terminal.output(pc.getValue());
		//test IR
		IR ir = new IR(1108);
		Terminal.output(ir.getOpCode());
		Terminal.output(ir.getOperand());
		//test ACC
		ACC acc = new ACC(9);
		acc.add(7);
		acc.div(8);
		Terminal.output(acc.getValue());
	}

}
