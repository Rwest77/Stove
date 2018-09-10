
public enum Setting { 
	OFF("---"), LOW("--+"), MEDIUM("-++"), HIGH("+++");

	private String value;
	Setting (String avalue){
		value = avalue;
	}
	
	public String toString(){
		return value;
	}
}
