package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

public class WriteOutput {
	FileWriter file = null;
	BufferedWriter buffer = null;
	PrintWriter output = null;

	public WriteOutput() {

	}
	
	public WriteOutput(int n, Vector<Integer> eventsVisited, Vector<Integer> movements) {
	
		try{
			file = new FileWriter("outputFile.txt", false);
			buffer = new BufferedWriter(file);
			output = new PrintWriter(buffer);
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		output.println(n); //prints number of events visted
		
		for (int i : eventsVisited) { //prints events visited
			output.print(i + " ");
		}
		output.println();
		
		for (int i : movements) { //prints the +1's, -1's, and 0's
			output.print(i + " ");
		}	
	}
}
