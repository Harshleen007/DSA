import java.util.*;
import java.util.regex.*;
public class Password
{
	    public static void main(String args[]) {
	    	Scanner sc=new Scanner(System.in);
	        String password = sc.next();
	        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
	        boolean validPassword = isValidPassword(password,regex);
	        System.out.println(password+" is valid password: " +validPassword);
	    }
	 
	    public static boolean isValidPassword(String password,String regex)
	    {
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(password);
	        return matcher.matches();
	    }
}
