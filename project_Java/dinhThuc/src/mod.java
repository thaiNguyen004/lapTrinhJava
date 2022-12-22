
public class mod {
	int x;
	int y;
	public mod() {
	}
	
	public int mods(int x, int y)
	{
		this.x = x;
		this.y = y;
		int r = x%y;
		return (r<0?r+y:r);
	}
	
}
