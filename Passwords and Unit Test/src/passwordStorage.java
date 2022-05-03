import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.ArrayList;


public class passwordStorage {
	static ArrayList<String> password = new ArrayList<String>();
	public static void main(String[] args) {
		
		
		Scanner scrn = new Scanner(System.in); //Create a Scanner Object for password
		
		System.out.println("Only New passwords\nBetween 7-12 characters\n" +
		"At least one (1) number but cannot use the number 6\n" + 
		"No spaces permited\n" +
		"Must contain at least 2 capital vowels, y is included\n" +
		"The phrase admin and mod may be used as passwords and ignores all other rules but" +
		"cannot be a duplicate\n");
		
		while(true) {
			String pwd = scrn.nextLine(); //Read user input
			
				if (addPassword(pwd)) {
					System.out.println("Password valid and accepted");
				
				}
				else {
					System.out.println("Error try again");
					System.out.println("Current Passwords\n" + password);	
				}
			}
	}
	
	public static boolean addPassword(String pass) {
		
		for(int i = 0; i < password.size();i++) {
			if ((password.get(i).equals(pass))) {
				System.out.println("Password already in list");
				return false;
			}
		}
			if (pass.equals("mod") || pass.equals("admin") ) {
				password.add(pass);
					
			}
			else if (validPwd(pass)) {
				password.add(pass);
				
			}
		
		return (validPwd(pass) || (pass.equals("mod")) || (pass.equals("admin")));
 }
 
 public static boolean validPwd(String pwd) {
	 	
	 	Pattern p = Pattern.compile("(?=.*[a-zA-Z])(?!.*6)(?!.*\s)(?=.*[A,E,I,O,U,Y]{2,}).+$");
		Matcher m = p.matcher(pwd);
		boolean b = m.matches();
		
		return b;
 }
}
