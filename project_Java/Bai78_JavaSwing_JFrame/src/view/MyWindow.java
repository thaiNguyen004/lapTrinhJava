package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	public MyWindow()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showIt()
	{
		this.setVisible(true);
	}
	public void showIt(String title)
	{
		this.setTitle(title);
		this.setVisible(true);
	}
	public void showIt(String title, int width, int height)
	{
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}
	public void showIt(String title, int width, int height, int x, int y)
	{
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
		this.setLocation(x, y);
	}
	public static void main(String[] args) {
		MyWindow m1 = new MyWindow();
		m1.showIt();
		MyWindow m2 = new MyWindow();
		m2.showIt("Window 2");

		MyWindow m3 = new MyWindow();
		m3.showIt("Window 3", 600, 400);
	}
}
