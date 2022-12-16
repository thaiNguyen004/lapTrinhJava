	
public class test {
	public static void main(String[] args) {
		dogs dog1 = new dogs();
		cat cat1 = new cat();
		bird bird1 = new bird();
		System.out.println("Dog: ");
		dog1.eat();
		dog1.makeSound();
		dog1.sleep();
		System.out.println("Cat: ");
		cat1.eat();
		cat1.makeSound();
		cat1.sleep();
		System.out.println("Bird: ");
		bird1.eat();
		bird1.makeSound();
		bird1.sleep();
	}
}
