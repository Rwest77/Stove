package main;

public class Main {
	
	public static void main(String[] args){ 
		ReadInput events = new ReadInput("Input.txt");
		Algorithm algo = new Algorithm(events.n, events.positions);
		System.out.println("Finished Program");
	}
}
