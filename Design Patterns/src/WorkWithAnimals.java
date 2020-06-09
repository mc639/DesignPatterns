public class WorkWithAnimals{
	
	int justAnNum = 10;
	
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
		System.out.println("Dog Name Before pass by ref : "+aang.getName());
		changeObjectName(aang);
		System.out.println("Dog Name After pass by ref : "+aang.getName());
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("Doggy Says : "+doggy.getSound());
		System.out.println("Kitty Says : "+kitty.getSound());
		
		Animal[] animals = new Animal[4];
		animals[0] = doggy;
		animals[1] = kitty;
		
		System.out.println("Kitty Says : "+animals[0].getSound());
		System.out.println("Kitty Says : "+animals[1].getSound());
		
		speakAnimal(doggy);
		speakAnimal(kitty);
		 
		((Dog)doggy).digHole();
		
		//Cannot use non static methods or variables in a static function
		//System.out.println(justAnNum); --> error
		//System.out.println(sayHello()); --> error
		
		//aang.bePrivate(); --> error
		aang.accessPrivate(); 
	} 
	public static void changeObjectName(Dog dog){
		dog.setName("Sokka");
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal Says : "+randAnimal.getSound());
	}
	
	public void sayHello(){
	}
}