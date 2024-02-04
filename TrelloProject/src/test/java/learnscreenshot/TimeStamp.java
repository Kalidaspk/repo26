package learnscreenshot;

import java.time.LocalDateTime;

public class TimeStamp 
{
	public static void main(String[] args) 
	{
	//capture the local time and date of the machine
			LocalDateTime Local=LocalDateTime.now();
			System.out.println(Local);
			//converting into string
				String timeString = Local.toString();
				System.out.println(timeString);
				String updateString = timeString.replace(':', '-');
				System.out.println(updateString);
				String timeStamp = LocalDateTime.now().toString().replace(':','-');
				System.out.println(timeStamp);
	}
}
