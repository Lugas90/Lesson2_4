
public class Main {
    public static void main(String [] args) {

        boolean result = Validator.checkAuthorization("vasya", "qwerty", "qwert");
        if(result){
            System.out.println("Логин и пароль прошли проверку");
        } else {
            System.out.println("Логин и/ или пароль некорректен");
        }
    }

}