
public class Burner {
	public enum Tempurature {BLAZING, HOT, WARM, COLD};
	
	Tempurature myTempurature;
	Setting mySetting;
	int timer;
	public final static int TIME_DURATION = 2;
	
	Burner (){
		this.myTempurature = Tempurature.COLD;
		this.mySetting = Setting.OFF;
	}
	
	public void plusButton(){
		if (mySetting == Setting.OFF){
			mySetting = Setting.LOW;
		}
		
		if (mySetting == Setting.LOW){
			mySetting = Setting.MEDIUM;
		}
		
		if (mySetting == Setting.MEDIUM){
			mySetting = Setting.HIGH;
		}
		
		if (mySetting == Setting.HIGH){
			System.out.println("Burner already at highest setting");
		}
	}
	
	public void minusButton(){
		if (mySetting == Setting.OFF){
			System.out.println("Setting is already at the lowest setting");
		}
		
		if (mySetting == Setting.LOW){
			mySetting = Setting.OFF;
		}
		
		if (mySetting == Setting.MEDIUM){
			mySetting = Setting.LOW;
		}
		
		if (mySetting == Setting.HIGH){
			mySetting = Setting.MEDIUM;
		}
	}
	
	public void updateTemperature(){
		
	}
}
