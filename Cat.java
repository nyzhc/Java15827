public class Cat {
	private static int sid = 0;
	private String name;
	int id;
	
	Cat(String name) {
		this.name = name;
		id = sid++;
	}
	
	void display() {
		System.out.println(id+" cat's name: "+name);
	}
	
	public static void main(String args []) {
		Cat.sid = 100;
		//id = 10;		//静态方法中无法访问非static（静态）变量
		Cat mimi = new Cat("mimi");
		mimi.sid = 1000;
		Cat pipi = new Cat("pipi");
		mimi.display();
		pipi.display();
		System.out.println("sid = "+sid);
	} 
}