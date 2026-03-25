package Interface;

public class Main {
    public static void main(String[] args) {
        LoginService login;

        login = new DatabaseLogin();
        login.login("phyu", "123");

        login = new GoogleLogin();
        login.login("phyu", "123");

        login = new FacebookLogin();
        login.login("phyu", "123");
    }
}
