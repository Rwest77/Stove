package main;

public class Algorithm {
	int numEvents;
	int [] events;
	
	public Algorithm(int moves, int [] events){
		System.out.println("Algorithm Constructor called");
		this.events = events;
		this.numEvents = moves;
		Node root = new Node();
		root.time = 0;
		root.key = 0;
		createNode(root, 0);
	}
	
	public void createNode(Node parent, int path){
		Node node = new Node(parent, path);
		node.key = node.parent.key + 1;
		node.time = node.parent.time + 1;
		node.position = node.parent.position + path;
			
		/*check if node is at an event*/
		if(events[node.time] == node.position) node.atEvent = true;
		else node.atEvent = false;
		
		System.out.println(node.parent);
		
		if(Math.abs((node.position - 1) - (events[numEvents - 1])) <= (this.numEvents - node.time)){ 
			createNode(node, -1);
		}
		if(Math.abs((node.position + 1) - (events[numEvents - 1])) <= (this.numEvents - node.time)){ 
			createNode(node, 1);
		}
		if(Math.abs((node.position) - (events[numEvents - 1])) <= (this.numEvents - node.time)){ 
			createNode(node, 0);
		}
	}
}
