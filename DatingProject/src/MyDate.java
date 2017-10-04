/**
 * 
 * @author a colab of Justin Mattix and Dax Ewing
 * Date Project
 *
 */
//implementing the interface
public class MyDate implements DateInterface
{
	//defining all the arrays and variables
	static String[] Month = {"January" , "Feburary" , "March" , "April" , "May" , "June" , "July" , "August" , "September" , "October" , "November" , "December"};
	
	static String[] dayofweek = {"Sunday", "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Satuday"};
	
	static int day;
	
	static int month;
	
	static int dayWeek;
	
	static int Year;
	/*
	 * getting the day from year(non-Javadoc)
	 * @see DateInterface#getDay()
	 */
	public int getDay() 
	{
		return day;
	}
	/*getting the day of week
	 * (non-Javadoc)
	 * @see DateInterface#getDow()
	 */
	public int getDow() 
	{
		return dayWeek;
	}
/*getting the month
 * (non-Javadoc)
 * @see DateInterface#getMonth()
 */
	public int getMonth() 
	{
		return month;
	}
	/*getting the year
	 * (non-Javadoc)
	 * @see DateInterface#getYear()
	 */
	public int getYear() 
	{
		return Year;
	}
/*Setting the variables
 * (non-Javadoc)
 * @see DateInterface#set(int, int, int, int)
 */
	public void set(int m, int d, int y, int dow)
	{
		day = d;
		dayWeek = dow;
		month = m;
		Year = y;
	}
	/*for calculating the date
	 * (non-Javadoc)
	 * @see DateInterface#tomorrow()
	 */
	public void tomorrow() 
	{
		if(day > 31)
		{
			day = 1;
			month++;
		}
		if(month > 11);
		{
			month = 0;
			Year++;
		}
		if(dayWeek > 6)
		{
			dayWeek = 0;
		}
		if((Year % 4 == 0 && Year % 100 != 0) || (Year % 100 == 0 && Year % 400 == 0))
		{
			day = day + 1;
		}
		
	}
	/* stringing the varialbes and the arrays
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return (dayofweek[dayWeek] + " " + Month[month] + " " + day + " " + Year);
	}
	
}
