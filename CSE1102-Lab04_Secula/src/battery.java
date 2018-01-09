//Jason Secula
//CSE1102
//LabFour
//Reynoldo 
//crearte battery constructor.
//do it as an int parameter.
//use _minutesLeft within this constructor
//store 30 within minutesleft
		
public class battery {
	public int _minutesLeft;
public battery(){
	recharge(); 
}
		public battery(int Minutes){
		_minutesLeft = Minutes; 
			
		}
	public void recharge(){
		_minutesLeft = 30;
		int Minutes = 30;
		
	}
	public int getMinutes(){
		return _minutesLeft;		
	}
}