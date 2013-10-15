/**
 * 
 */


import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author maheshh
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String method = "[validatePassword(password)] -> ";

		/*Pattern pattern = null;
		Matcher matcher;
		final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		pattern = Pattern.compile(PASSWORD_PATTERN);
		matcher = pattern.matcher("Tarshan1@");
		
		if(matcher.matches()){
			System.out.println("Match");
		}
*/		

/*		int i = 4;
		String ai [] = new String [-3]; 
		System.out.println(ai.length);*/
	//	System.out.println(getEffectiveDate());
		
		
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Entered");
			if(i==2){
				try {
					System.out.println("Tried 2");
				} catch (Exception e) {
					throw e;
				}
			}
			System.out.println(i);
		}
		
		
	}
	
/*	public static Date getEffectiveDate() {
 		System.out.println("Hello:");
		Calendar future = Calendar.getInstance();
		System.out.println("future - " + future.getTime());
		future.add(Calendar.DATE, 10);
  return future.getTime();
 }*/

}
