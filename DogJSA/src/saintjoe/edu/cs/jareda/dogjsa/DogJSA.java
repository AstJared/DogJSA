package saintjoe.edu.cs.jareda.dogjsa;

public class DogJSA {
	// This class has (for now) just one data member.
	
	// This value represents the dog's name, and is a String object.
	String name; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogJSA dog1 = new DogJSA();
		dog1.bark();
		dog1.name = "Bart";
		
		DogJSA[] myDogs = new DogJSA[3];
		myDogs[0] = new DogJSA();
		myDogs[1] = new DogJSA();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		System.out.print("last dog's name is ");
		System.out.println(myDogs[2].name);
		
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
			
		}
		
		
	}


	public void bark() {
		System.out.println(name + " says Ruff!");
	}
	public void eat() { }
	public void chaseCat() { }
	}
	
