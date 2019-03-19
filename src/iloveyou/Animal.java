package iloveyou;

public class Animal {
	 public int age;
	 public String name;
	 static int i=1; 
	 public  void eat(){
		System.out.println("»á³Ô¶«Î÷£¡");
	}
	 
	 public Animal(){
		 System.out.println("AnimalÀàÖ´ÐÐÁË");
		 //age=20;
		 name="hasaki";
	 }

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}
	 
//this is a test
}
