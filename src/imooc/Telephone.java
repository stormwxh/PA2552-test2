package imooc;

public class Telephone {
	public float cpu;
	private float screen;
	public float memory;
	static String hobby="NMB";
	public Telephone(){
		System.out.println("imooc的无参构造方法执行了");
	}

	public Telephone(float screen,float cpu,float memory,String hobby) {
		this.hobby=hobby;
		this.screen=screen;
		this.cpu=cpu;
		this.memory=memory;
		
	}
	public void send(){
		System.out.println("草你麻痹");
	}

	

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public float getScreen() {
		return screen;
	}

	public void setScreen(float screen) {
		this.screen = screen;
		
	}

	public float getMemory() {
		return memory;
		
	}

	public void setMemory(float memory) {
		this.memory = memory;
		this.send();
		
	}

	public static String getHobby() {
		return hobby;
	}

	public static void setHobby(String hobby) {
		Telephone.hobby = hobby;
	}

	public static void main(String[] args) {
		Telephone myphone2=new Telephone();
		Telephone myphone = new Telephone(1.0f,2.0f,3.0f,"SB");
		myphone.setMemory(8.0f);
		System.out.println(myphone.getScreen());
		System.out.println(myphone.getMemory());
		System.out.println(myphone.hobby);
		

	}

}
