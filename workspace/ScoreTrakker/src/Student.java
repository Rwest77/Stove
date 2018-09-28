/**
 * Authors: Ryan West, Carson Stevens, Adrian Estrada
 * Exercise: C10A File IO
 */
public class Student implements Comparable<Student>{
	
	@Override
	public String toString() {
		return name + " " + score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	private String name;
	private int score;
	
	public Student() {

	}

	/**
	 * @param name
	 * @param score
	 */
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		
		if (o.getScore() == this.score) return 0;
		
		else if(o.getScore() > this.score) {
			return 1;
		}
		
		else return -1;
	}

	
}
