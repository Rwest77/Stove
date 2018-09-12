
public class Burner {
	public enum Temperature {COLD ("cooool"), WARM ("warm"), HOT ("CAREFUL"), BLAZING ("VERY HOT! DON'T TOUCH");
	
		private String value;
		Temperature (String avalue){
			value = avalue;
		}
		
		public String toString(){
			return value;
		}
	}
	
	Temperature myTemperature;
	
	Setting mySetting;
	int timer;
	
	
	public final static int TIME_DURATION = 2;
	
	Burner (){
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
	}
	
	public void updateTemperature(){
		//reset timer if it is at zero
		if(timer == 0) timer = TIME_DURATION; 
		timer--;
		
		//timer has hit 0
		if(timer == 0){
			if (mySetting.ordinal() == myTemperature.ordinal()){
				return;
			}
			
			//if the setting is higher than the temperature
			if(mySetting.ordinal() > myTemperature.ordinal()){ 
				myTemperature = myTemperature.values()[myTemperature.ordinal() + 1];
			}
			
			//if the setting is lower than th temperature
			else{
				myTemperature = myTemperature.values()[myTemperature.ordinal() - 1];

			}
		}
	}
	
	
	public void plusButton(){
		if (mySetting == Setting.OFF){
			mySetting = Setting.LOW;
			return;
		}
		
		if (mySetting == Setting.LOW){
			mySetting = Setting.MEDIUM;
			return;
		}
		
		if (mySetting == Setting.MEDIUM){
			mySetting = Setting.HIGH;
			return;
		}
		
		if (mySetting == Setting.HIGH){
			return;
		}
	}
	
	public void minusButton(){
		if (mySetting == Setting.OFF){
			return;
		}
		
		if (mySetting == Setting.LOW){
			mySetting = Setting.OFF;
			return;
		}
		
		if (mySetting == Setting.MEDIUM){
			mySetting = Setting.LOW;
			return;
		}
		
		if (mySetting == Setting.HIGH){
			mySetting = Setting.MEDIUM;
			return;
		}
	}
	
	
	public Temperature getMyTempurature() {
		return myTemperature;
	}

	public void display(int burnerNumber){
		System.out.println("[" + mySetting.toString() + "]....."+ myTemperature.toString());
	}
}
