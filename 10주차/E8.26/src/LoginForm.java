public class LoginForm {
    
    private String username;
    private String password;
    private String currentUsername;
    private String currentPassword;

    private boolean logged;
    private boolean firstInput;

    public LoginForm(String Username, String Password)
    {
        username = Username;
        password = Password;
        firstInput = true;
        logged = false;
    }
    public void input(String text)
    {
        if(firstInput)
        {
            currentUsername = text;
            firstInput = false;
        }
        else
        {
            currentPassword = text;
        }
    }

    private boolean checkLogin()
    {
        if(username.equals(currentUsername) && password.equals(currentPassword))
        {
            return true;
        } 
        return false;
    }

    public void click(String button)
    {
        if(button.equals("Submit"))
        {
            if(checkLogin())
            {
                logged = true;
            }
        }
        else if (button.equals("Reset"))
        {
            reset();
        }
    }

    private void reset()
    {
        firstInput = true;
        currentUsername = "";
        currentPassword = "";
        logged = false;
    }
    
    public boolean loggedIn()
    {
        if(logged)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
