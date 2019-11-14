package com.hervey.app;

public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dogAnimal = new Dog();
		
		System.out.println("Code line:  Animal dogAnimal = new Dog();");
		System.out.println("Is dogAnimal an instance of the Reference Type Animal?  " + (dogAnimal instanceof Animal));
		System.out.println("Is dogAnimal an instance of the Object Type Dog?  " + (dogAnimal instanceof Dog) + "\n");
		System.out.println("the getClass of dogAnimal is:  " + dogAnimal.getClass());
		//System.out.println("Declared type of dogAnimal is  " + getContainingType(dogAnimal));
		

	}

}
