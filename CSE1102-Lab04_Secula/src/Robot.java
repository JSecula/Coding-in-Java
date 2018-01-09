//Jason Secula
//CSE1102
//LabFour
//Reynoldo 
public class Robot {
	private String _jimmy;
	private int _serialnumber;
	private battery _powersource; //creating battery fixed error
	private Gripper _griper; //need seperate class 
	
public Robot(){
		_jimmy = "";
		_serialnumber = -1;
		_powersource = new battery();
		_powersource.recharge(); //within the battery class
		_griper = new Gripper();
	}
public Robot(String name, int snum, int minutes){
	_jimmy = name;
	_serialnumber = snum;
	_powersource = new battery(minutes);
	}
public int getMinutes(){
	return _powersource.getMinutes();
	}
}
