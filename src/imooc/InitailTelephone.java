package imooc;

public class InitailTelephone {
	public static void main(String []args){
		Telephone Iphone=new Telephone(1.0f,2.0f,3.0f,"GG");
		System.out.println(Iphone.memory);
		Iphone.memory=3.2f;
		Iphone.setScreen(5.0f);
		System.out.println(Iphone.getScreen());
		
	}

}
