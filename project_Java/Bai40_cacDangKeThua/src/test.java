
public class test {
	public static void main(String[] args) {
		dogs dog = new dogs();
		dog.eat();
		babyDog bbdog = new babyDog();
		bbdog.eat();
		bbdog.bark();
		bbdog.weep();
		bbdog.setName("Chó Shiba");
		System.out.println(bbdog.getName());
	}
}
