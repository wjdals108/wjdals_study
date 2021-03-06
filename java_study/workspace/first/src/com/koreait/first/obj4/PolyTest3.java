package com.koreait.first.obj4;

public class PolyTest3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		polyCry(dog);
		polyCry(cat);
		polyCry(bird);
	}
	
	public static void polyCry(Animal animal) { 
		animal.crying();
		if(animal instanceof Dog) {								//형변환이 가능하면 true 형변환이 안되면 false
			//Dog dog = (Dog)animal;
			//dog.shakeTail();
			
			((Dog)animal).shakeTail();
		}
	}
}
