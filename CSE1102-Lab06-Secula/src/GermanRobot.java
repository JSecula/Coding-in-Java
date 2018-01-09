
public class GermanRobot extends Robot {

	public GermanRobot(String aName){
		super(aName);
	}
	@Override
	public void sayName(){
	System.out.println("My name is "+ this.getName());
		this.sayName();
	}
	@Override
	public void sayHello() {
		System.out.println("\n Guten Tag. Ich heiße Heidi");
	}
}
