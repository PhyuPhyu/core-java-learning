package Interface;

public class GoogleLogin implements LoginService {
    public void login(String username, String password) {
        System.out.println("Login using Google for user: " + username);
    }
}
