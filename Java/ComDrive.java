class complex
{
	private double real;
	private double imag;

	protected complex (double real, double imag)
	{
		this.setReal(real);
		this.setImag(imag);
	}
	//setters
	protected void setReal(double real)
	{
		this.real = real;
	}
	protected void setImag(double imag)
	{
		this.imag = imag;
	}
	//getters
	protected double getReal()
	{
		return this.real;
	}
	protected double getImag()
	{
		return this.imag;
	}

	protected complex addition(complex o2)
	{
		complex add = new complex((this.real+o2.real),(this.imag+o2.imag));
		return add;
	}

	@Override
	public String toString()
	{
		return (this.real+" "+this.imag);

	}
}

public class ComDrive
{
	public static void main(String[] args)
	{
		complex o1 = new complex(2,3);
		complex o2 = new complex(3,4);
		complex add = o1.addition(o2);
		System.out.println(o1);
		System.out.println(add);
	}
}