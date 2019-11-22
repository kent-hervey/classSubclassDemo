package com.hervey.app;

public class Driver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dogAnimal = new Dog();
		
		System.out.println("Code line:  Animal dogAnimal = new Dog();");
		System.out.println("Thus, Animal is the Declared Type; Dog is the object type--aka run-type or actual type\n");
		
		System.out.println("Using \"instanceof\"");
		System.out.println("Is dogAnimal an instance of type Object?  " + (dogAnimal instanceof Object));
		System.out.println("Is dogAnimal an instance of type Animal?  " + (dogAnimal instanceof Animal));
		System.out.println("Is dogAnimal an instance of type Dog?  " + (dogAnimal instanceof Dog) );
		System.out.println("Thus, instanceof does not tell us the declared type, or object type, but if we test for either, it will yeild true.\n");
		System.out.println("The getClass name of dogAnimal is:  " + dogAnimal.getClass().getName());
		System.out.println("This is the object type or run-type");
		

	}

}
