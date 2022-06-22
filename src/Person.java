import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

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

    public static void authorization(Person person) throws WrongLoginException, WrongPasswordException {
        String login = null;
        String password = null;
        String confirmPassword = null;

        String[] values = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "_", "Q", "q", "W", "w",
                "E", "e", "R", "r", "T", "t", "Y", "y", "U", "u", "I", "i", "O", "o", "P", "p", "A",
                "a", "S", "s", "D", "d", "F", "f", "G", "g", "H", "h", "J", "j", "K", "k", "L", "l",
                "Z", "z", "X", "x", "C", "c", "V", "v", "B", "b", "N", "n", "M", "m"};

        for (int i = 0; i < values.length; i++) {
            if (!person.getLogin().contains(values[i])) {
                throw new WrongLoginException("логин некорректен");
            }
        }
        for (int i1 = 0; i1 < values.length; i1++) {
            if (!person.getPassword().contains(values[i1])) {
                throw new WrongPasswordException("пароль некорректен");
            }
        }
        if (!person.getConfirmPassword().equals(person.getPassword())) {
            throw new WrongPasswordException("подтверждение некорректно");
        } else if (person.getLogin().length() > 20) {
            throw new WrongLoginException("логин слишком длинный");
        } else if (person.getPassword().length() > 19) {
            throw new WrongPasswordException("пароль слишком длинный");
        }
    }
}
