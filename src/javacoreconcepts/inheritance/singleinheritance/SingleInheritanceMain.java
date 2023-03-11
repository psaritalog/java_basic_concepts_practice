package javacoreconcepts.inheritance.singleinheritance;

public class SingleInheritanceMain {
	public static void main(String[] args) {
		//this calls only Animal class methods 
		Animal a = new Animal();
		a.parentMetnod();
	
		
		//This also only calls Animal class methods
		Animal a1 = new Cat();
		a1.parentMetnod();
		a1.run();
		
		//If your tying call cat class methods using animal class it's can't supports
		//a1.childMethod();
		
        //If you'r created child class object then child as well as parent class methods will be called 
		//via a child object
		Cat c = new Cat();
		c.childMethod();
		c.parentMetnod();

		
		//We can't use casting in single inheritance 
		//Cat c1 = (Cat)a;
	    //c1.childMethod();
		//c1.parentMetnod();
		
		
		
		
	}
}
