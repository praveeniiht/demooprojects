package yaksha;
import java.util.*;
import java.util.function.Predicate;
public class MainClass {
	
	public static boolean checkUser(User user) {
		Predicate<User> predicate = usr->usr.getUsername().equals("admin") && usr.getPassword().equals("1234");
		return predicate.test(user);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your login");
		String uname = scanner.nextLine();
		System.out.println("Enter password");
		String pwd = scanner.nextLine();
		User user = new User(uname,pwd);
		if(checkUser(user))
			System.out.println("Valid User");
		else
			System.out.println("Invalid User");
				
	}

}
