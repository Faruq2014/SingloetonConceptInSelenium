package rough;

public class Mango {

	public static void main(String[] args) {
		apple a = new apple();
		 a.name="Faruq";
		System.out.println();
		a.getName();

	}

}

class apple{
	
	public apple(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	String name;
	int age; 
	int id;
	
	public apple(String name) {
		this.name = name;
	}

	apple(){
		
	}
	
	public void getName() {
		System.out.println("method");
	}
	
	
}