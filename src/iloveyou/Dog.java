package iloveyou;

public class Dog extends Animal {
	//public  int age=100;
	public Dog(){
		
		System.out.println("Dog类方法执行了！");
		
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	public void eat(){
		System.out.println("年龄："+age+"狗狗会吃东西！");
	}
	public void show(){
		eat();
	}

}
