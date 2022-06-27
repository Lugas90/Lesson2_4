import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Validator {
   private static final String VALUES ="0123456789_QqWwEeRrTtYyUuIiOoPpAaSsDdFfGgHhJjKkLlZzXxCcVvBbNnMm";

    private Validator(){
    }
    public static boolean checkAuthorization (String login, String password, String confirmPassword){
        try {
            authorization(login, password, confirmPassword);
            return  true;
        } catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void authorization(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() >= 20) {
            throw new WrongLoginException("логин слишком длинный");
        }
        if (password == null || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("пароль и подтверждение пароля не совпадают");
        }
        if (password.length() > 20) {
            throw new WrongPasswordException("пароль слишком длинный");
        }
        for (int i = 0; i < login.length(); i++) {
            if (!VALUES.contains(String.valueOf(login.charAt(i)))) {
                throw new WrongLoginException("логин содержит неверный символ: " + login.charAt(i));
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (!VALUES.contains(String.valueOf(password.charAt(i)))) {
                throw new WrongPasswordException("пароль содержит неверный символ: " + password.charAt(i));
            }
        }
    }
}
