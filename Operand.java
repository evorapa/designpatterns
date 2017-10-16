public class Operand extends Node {
	public int value;

	public Operand(int i) {
		value = i;
	}

	public String toString(){
		return Integer.toString(value);
	}

}