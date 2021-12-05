import java.util.*;
class Clock
{
	int hours,minutes,seconds;

	Clock(int h ,int m, int s)
	{
		hours=h;
		minutes=m;
		seconds=s;
	} 

	void isTimeValid()
	{
		if(hours>=0 &&  hours <24 && minutes >=0  && seconds>=0 )
		{
			System.out.println("time is valid");
			setAmPmMode();
		}
		else
			System.out.println("time is not valid");
	}

	void setAmPmMode()
	{
		if (seconds > 60)
		{
			minutes = minutes+seconds/60;
			seconds = seconds%60;
		}
		
		if (minutes > 60)
		{
			hours = hours+minutes/60;
			minutes = minutes%60;
		}
		
		if(hours > 24)
			System.out.println("time is not valid");
		
		
		else 
		{
			if(hours<12)
			{ 
				System.out.println("Time is "+hours+":"+minutes+":"+seconds+" AM");
			}
			else
			{
				if(hours!=12)
					hours=hours-12;
				System.out.println("Time is "+hours+":"+minutes+":"+seconds+" PM");
			} 
		}
	}
}
class A05
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours");
        int h = sc.nextInt();
        System.out.println("Enter Minutes");
        int m = sc.nextInt();
        System.out.println("Enter Seconds");
        int s = sc.nextInt();
        Clock c1= new Clock(h, m, s);
		c1.isTimeValid();

		sc.close();
	}
}
