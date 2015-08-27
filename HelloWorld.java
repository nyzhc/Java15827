public class HelloWorld
{
	public static void main(String [] args)
	{
		System.out.println("HellWorld");
		Dog d = new Dog();
		System.out.println(d);
	}
}

class Dog {
	public String toString() {
		return "I'm a cool dog!";
	}
}