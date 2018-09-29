/**
 * Authors: Ryan West, Carson Stevens, Adrian Estrada
 * Exercise: C10A File IO
 */   
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Collections;

public class ScoreTrakker {

	private ArrayList<Student> studentList = new ArrayList<Student>();
	private String[] files = {"scores.txt", "badscore.txt", "nofile.txt" };
	
	public ScoreTrakker() {
	}

	public void loadDataFromFile(String fileName) throws FileNotFoundException{
		studentList.clear();
		FileReader reader = new FileReader(fileName);
		Scanner scan = new Scanner(reader);
		while(scan.hasNextLine()) {

			String name = scan.nextLine();
			String score = scan.nextLine();
			try{
				int numScore = Integer.parseInt(score);
				studentList.add(new Student(name, numScore));
			}
			catch(NumberFormatException e){
				System.out.println("Incorrect format for " + name + " not a valid score: " + score);
			}
		}
		System.out.println();
	}
	
	public void printInOrder() {
		Collections.sort(studentList);
		for( Student student: studentList) {
			System.out.println(student.toString());
		}
		System.out.println();
	}
	
	public void processFiles(){
		for(String file : files){
			try{
				loadDataFromFile(file);
				printInOrder();
			}
			catch(FileNotFoundException e){
				System.out.println("Can't open file: " + file);
			}
			
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		ScoreTrakker trak = new ScoreTrakker();
		trak.processFiles();
	}
}
