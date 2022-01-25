package Test;
public class Dog
{
	private int a;
	protected Dog(int a)
	{
		this.setA(a);
	}
	protected void setA(int a)
	{
		this.a=a;
	}
	protected int getA()
	{
		return this.a;
	}
	protected void display()
	{
		System.out.println(getA());
	}
}