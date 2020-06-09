public class WorkWithAnimals{
	public static void main(String[] args){
		
		Dog aang = new Dog();
		
		aang.setName("aang");
		System.out.println(aang.getName());
		aang.digHole();
		aang.setWeight(-1);
		
		//Everything in java is Pass By Value except Objects;
		int randNum = 9;
		aang.changeVar(randNum);
		System.out.println("randNum Value : "+randNum);
		
		//Only Objects are pass By Reference in Java;
		System.out.println(aang.getName());
		changeObjectName(aang);
		System.out.println(aang.getName());
	} 
	public static void changeObjectName(Dog dog){
		dog.setName("Sokka");
	}
}