package Interface;

public class FacebookLogin implements LoginService {
    public void login(String username, String password) {
        System.out.println("Login using Facebook for user: " + username);
    }
}
