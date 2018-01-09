
public class FrenchRobot extends Robot {

	public FrenchRobot(String aName){
		super(aName);
	}
	@Override
	public void sayName(){
		System.out.println("My name is "+ this.getName());
		this.sayName();
	}
	@Override
	public void sayHello() {
		System.out.print("\n Bon jour. Je m'appelle Aurelia");
	}
}