import java.util.ArrayList;

public class Node {
	public ArrayList<Node> children = new ArrayList<Node>();

	public void accept(Visitor v) {
		v.visit(this);
	}

}