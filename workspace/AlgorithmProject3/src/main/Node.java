package main;

public class Node {
	
	Node parent = null;
	int time;
	int position;
	int key;
	boolean atEvent;
	
	public Node(Node parent, int path){
		this.parent = parent;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Node [time=" + time + ", position=" + position + ", key=" + key + ", atEvent=" + atEvent + "]";
	}
	
}
