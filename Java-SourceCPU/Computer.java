package P3;

import java.util.Scanner;

public class Computer {
	
	private Memory memory;
	private Register IR;
	private Register PC;
	private Register ACC;
	
	public Computer(){
		IR = new IR(0);
		PC = new PC(0);
		ACC = new ACC(0);
		memory = new Memory(100);
	}
	
	public void run(){
		boolean end = false;
		memory.loadProgram();
		PC.setValue(0);
		
		while(!end){
			fetch();
			incrementPC();
			end = execute();
		}
		
	}
	
	public void fetch(){
		IR.setValue( memory.getValue(PC.getValue()));
	}
	
	public boolean execute(){
		IR tempIR = new IR(IR.getValue());
		ACC temporaryACC = new ACC(ACC.getValue());
		PC tempPC = new PC(PC.getValue());
		switch(tempIR.getOpCode()){
		case 0:
			return true;
		case 1:
			ACC.setValue(memory.getValue(tempIR.getOperand()));
			break;
		case 2:
			memory.setValue(tempIR.getOperand(), ACC.getValue());
			break;
		case 3:
			temporaryACC.add(memory.getValue(tempIR.getOperand()));
			break;
		case 4:
			temporaryACC.sub(memory.getValue(tempIR.getOperand()));
			break;
		case 5:
			temporaryACC.mult(memory.getValue(tempIR.getOperand()));
			break;
		case 6:
			temporaryACC.div(memory.getValue(tempIR.getOperand()));
			break;
		case 7:
			memory.setValue(tempIR.getOperand(),Terminal.input());
			break;
		case 8:
			Terminal.output(tempIR.getOperand());
			break;
		case 9:
			tempPC.setValue(tempIR.getOperand());
			break;
		case 10:
			if(temporaryACC.getValue() > 0 ){
				tempPC.setValue(tempIR.getOperand());
			}
			break;
		case 11:
			if(temporaryACC.getValue() == 0){
				tempPC.setValue(tempIR.getOperand());
			}
			break;
		}
		
		IR.setValue(tempIR.getValue());
		ACC.setValue(temporaryACC.getValue());
		return false;
	}
	
	public void incrementPC(){
		PC temp = new PC(PC.getValue());
		temp.increment();
		PC.setValue(temp.getValue());
	}
}
