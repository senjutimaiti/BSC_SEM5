import Test.*;

public class Show extends Dog
{
	public Show(int a)
	{
		super(a);
	}
	public static void main(String[] args)
	{
        	Show s = new Show(5);
        	s.display();
	}
}
