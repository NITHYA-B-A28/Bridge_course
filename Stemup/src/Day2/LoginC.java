package Day2;
import java.util.Scanner;
public class LoginC {
	public static void main(String[]args) {
		String username="admin";
		String password="password123";
		String enterdUsername ="admin";
		String enterdPassword="password123";
		if((username.equals(enterdUsername)) && (password.equals(enterdPassword))) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
			
		
		
	}

}
