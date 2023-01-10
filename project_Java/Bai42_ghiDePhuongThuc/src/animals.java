
public class animals {
	protected String name;

	public animals(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void eat()
	{
		System.out.println("Tôi đang ăn: ");
	}
	public void makeSound()
	{
		System.out.println("???");
	}
	public void sleep()
	{
		System.out.println("Zzz");
	}
	
}


