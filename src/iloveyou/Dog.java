package iloveyou;

public class Dog extends Animal {
	//public  int age=100;
	public Dog(){
		
		System.out.println("Dog�෽��ִ���ˣ�");
		
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
		System.out.println("���䣺"+age+"������Զ�����");
	}
	public void show(){
		eat();
	}

}
