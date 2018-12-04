package testPack;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest
{
	public static void main(String[] args)
	{
	//	Dog dog = new Dog("Spike");
	//	System.out.println(dog.getName() + " says " + dog.speak());
		Yorkshire york = new Yorkshire("York");
		Labrador lab = new Labrador("Lab","Green");
		System.out.println(york.getName() + " says " + york.speak());
		System.out.println(lab.getName() + " says " + lab.speak());
		lab.avgBreedWeight();
		york.avgBreedWeight();
		
	}
}
