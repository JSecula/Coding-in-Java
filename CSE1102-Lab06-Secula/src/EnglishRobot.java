
public class EnglishRobot extends Robot {

	public EnglishRobot(String aName){
		super(aName);
	}
	@Override
	public void sayName(){
			System.out.println("My name is ");
		this.sayName();
	}
	@Override
	public void sayHello() {
		System.out.print("\n Good day. My name is"+ this.getName());
		System.out.println(" My purpose is to pass the butter."); //RickandMortyReferance
	}

}
