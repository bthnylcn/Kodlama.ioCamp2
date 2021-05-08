
public class UserManager {

	public void login(User user) {
		System.out.println(user.getEmail()+" "+ user.getPassword()+" giriþ yapýldý.");
		
	}
	
	public void logout(User user) {
		System.out.println(user.getEmail()+" çýkýþ yapýldý.");
	}
	
}
