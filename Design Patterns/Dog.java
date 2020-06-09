public class Dog extends Animal{
	
	public void digHole(){
		System.out.println("Dug a hole");
	}
	
	public Dog(){
		super();
		setSound("Bark");
	}
	public void changeVar(int randNum){
		randNum = 12;
		System.out.println("randNum Value : "+randNum);
	}
	//cannot call private method in parent class.
	private void bePrivate(){
		System.out.println("In a private moethod");
	}
	//can use a public method with calls the private method instead.
	public void accessPrivate(){
		bePrivate();
	}
	
}