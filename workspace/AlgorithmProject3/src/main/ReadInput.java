package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadInput {
	int[] positions; //positions of all events (in order)
	int n; //number of events
	
	//create instance of class with name of input file
	public ReadInput (String f) {
		try {
			FileReader reader = new FileReader(f);
			Scanner scan = new Scanner(reader);
			String currLine;
			//input file: first line is n and second line is positions of n events
			//always exactly two lines in the file
			currLine = scan.nextLine();
			positions = new int[Integer.parseInt(currLine)];
			n = positions.length;
			for (int i = 0; i < n; i++) {
				positions[i] = scan.nextInt();
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void outputData() {
		System.out.println("Number of Events:\n" + n + "\nEvent Coordinates: ");
		String coord = "";
		for (int i = 0; i < n; i ++) {
		coord += positions[i] + " ";
		}
		System.out.println(coord);
	}
	
	public static void main(String[] args){ //makes an instance of ReadInput as an example
		ReadInput test = new ReadInput("input.txt");
		test.outputData(); //not necessary
	}
}