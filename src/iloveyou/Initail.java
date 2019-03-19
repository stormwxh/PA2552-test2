package iloveyou;



public class Initail {

	public static void main(String[] args) {
		
		
		Dog dog=new Dog();
		dog.age=10;
		Dog dog2=new Dog();
		dog2.age=10;
		if(dog.equals(dog2)){
			System.out.println("相同");
		}else{
			System.out.println("不相同");
		}
		
		
//		dog.eat();
//		dog.show();
		// TODO 自动生成的方法存根

	}

}
