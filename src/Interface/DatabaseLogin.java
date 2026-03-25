package Interface;

public class DatabaseLogin implements LoginService {
    public void login(String username, String password) {
        System.out.println("Login using Database for user: " + username);
    }
}
