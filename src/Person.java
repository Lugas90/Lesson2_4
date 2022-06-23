public class Person {
    private String login;
    private String password;
    private String confirmPassword;

    public Person(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String toString() {
        return "логин " + login + "; пароль " + password + "; подтверждение пароля " + confirmPassword;
    }
}
