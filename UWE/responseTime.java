package responseTime;
import java.util.Date;
import java.util.HashMap;
import java.sql.Timestamp;  
import java.util.concurrent.TimeUnit;

public class Test {
	
	
	public static void main(String[] args) {
		
		 Date date = new Date();  
         Timestamp ts = new Timestamp(date.getTime());  
         HashMap<Integer, String> userArr = new HashMap<Integer, String>();
         HashMap<Integer, String> pwdArr = new HashMap<Integer, String>();
		 userArr.put(1, "Alice");
		 pwdArr.put(1, "123");
		 userArr.put(2, "Bob");
		 pwdArr.put(1, "123");
	
	}
	
	

	static boolean isPwd() {
		// wait 
		return true;
	}

	static String validate(String key, String value) {
		boolean valid = false;
		for (String element : pwdArr) {
			
		
		if (valid) {
		   return "Acccount exists!!";
		} else {
			return "Account doesn't exist";
		}
	}
}
