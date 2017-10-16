public class Driver{

	Operand op1;
	Operand op2;
	Operand op3;
	Operator optor1;
	Operator optor2;


	public static void main (String[] args) {

		Operand op1 = new Operand(1);
		Operand op2 = new Operand(5);
		Operand op3 = new Operand(7);
		Operator optor1 = new Plus();
		Operator optor2 = new Multiply();

		optor1.addChildren(op1);
		optor1.addChildren(optor2);
		optor2.addChildren(op2);
		optor2.addChildren(op3);

		System.out.println(optor1.toString());


		return;
	}
}