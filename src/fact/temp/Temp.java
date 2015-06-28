package fact.temp;

import java.text.MessageFormat;
import java.util.Date;

public class Temp {

	public static void main(String[] args) {
		Object[] arguments = {
			    new Integer(7),
			    new Date(),
			    "a disturbance in the Force"
			};

			String result = MessageFormat.format(
			    "At {1,time} on {1,date}, there was {2} on planet "
			     + "{0,number,integer}.", arguments);
			
//			System.out.println(result);
			
			fn();
	}
	
	static void fn(int... i){
		System.out.println(i);
	}
}
