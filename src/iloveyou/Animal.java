package iloveyou;

public class Animal {
	 public int age;
	 public String name;
	 static int i=1; 
	 public  void eat(){
		System.out.println("会吃东西！");
	}
	 
	 public Animal(){
		 System.out.println("Animal类执行了");
		 //age=20;
		 name="hasaki";
	 }

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}
	 

}
