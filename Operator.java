public abstract class Operator extends Node {
	public abstract String toString();

	public void addChildren(Node n) {
		children.add(n);
	}
}