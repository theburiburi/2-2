public class LoginFormTest {
    public static void main(String[] args) {
        LoginForm login = new LoginForm("admin", "admin123");

        login.input("test");
        login.input("test123");
        login.click("Submit");
        
        if(login.loggedIn())
        {
            System.out.println("User is logged in.");
        }
        else
        {
            System.out.println("User is not logged in.");
        }

        
        login.click("Reset");
        login.input("admin");
        login.input("admin123");
        login.click("Submit");

        if(login.loggedIn())
        {
            System.out.println("User is logged in.");
        }
        else
        {
            System.out.println("User is not logged in.");
        }
    }
}
