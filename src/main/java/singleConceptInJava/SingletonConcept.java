package singleConceptInJava;

public class SingletonConcept {
	/*
	To design a singleton class:
Make constructor as private.
]Write a static method that has return type object of this singleton class.
 Here, the concept of Lazy initialization is used to write this static method.  
	 */
	//regular instance variable
	public String name;
	//private instance variable with class data type.
	private static SingletonConcept singletonString=null;
	//private constructor
	private SingletonConcept() {
		name="My name is Faruq";
	}
	//static public method to instance variable.
	public static SingletonConcept getName() {
		if (singletonString==null) {
			singletonString=new SingletonConcept();
		}
		return singletonString;
	}

	public static void main(String[] args) {
		//SingletonConcept= new SingletonConcept(); 
		//can not create a reference from private variable.
		
		SingletonConcept Faruq=SingletonConcept.getName();
		Faruq.name=Faruq.name.toUpperCase();
		System.out.println(Faruq.name);
		SingletonConcept Khaled=SingletonConcept.getName();
		SingletonConcept Arif=SingletonConcept.getName();
		System.out.println(Khaled.name);
		System.out.println(Arif.name);
		
		Faruq.name=Faruq.name.toUpperCase()+" MOLLA";
		System.out.println(Faruq.name);
		System.out.println(Khaled.name);
		System.out.println(Arif.name);
		
		Khaled.name="My name is Khaled";
		System.out.println(Khaled.name);
		System.out.println(Faruq.name);
		System.out.println(Arif.name);
		
		Arif.name="My name is Arif";
		System.out.println(Arif.name);
		System.out.println(Khaled.name);
		System.out.println(Faruq.name);
	}

}
