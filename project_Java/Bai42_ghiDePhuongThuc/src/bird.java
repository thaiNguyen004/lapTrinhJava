
public class bird extends animals{
	public bird()
	{
		super("Bird");
	}
	@Override
	public void eat()
	{
		System.out.println("Tôi ăn sâu");
	}
	public void makeSound()
	{
		System.out.println("Chít chít");
	}
}
