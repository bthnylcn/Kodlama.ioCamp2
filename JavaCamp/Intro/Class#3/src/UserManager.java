
public class UserManager {

	public void login(User user) {
		System.out.println(user.getEmail()+" "+ user.getPassword()+" giri� yap�ld�.");
		
	}
	
	public void logout(User user) {
		System.out.println(user.getEmail()+" ��k�� yap�ld�.");
	}
	
}
