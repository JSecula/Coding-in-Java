//JasonSecula
public abstract class Robot {
	private String  _name;
	
	public Robot (String aName){
		_name = aName;
	}
	public void sayName(){
		System.out.println("My name is"+_name); 
		
	}
	
	public abstract void sayHello();

	public String getName (){
		return _name;
	}
}
