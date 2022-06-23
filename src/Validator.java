import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Validator {

   static final String values ="0123456789_QqWwEeRrTtYyUuIiOoPpAaSsDdFfGgHhJjKkLlZzXxCcVvBbNnMm";

    private static void authorization(Person person) throws WrongLoginException, WrongPasswordException {
            if (!values.contains(person.getLogin())) {
                throw new WrongLoginException("логин некорректен");
            }
            if (!values.contains(person.getPassword())) {
                throw new WrongPasswordException("пароль некорректен");
            }
            else if (!person.getConfirmPassword().equals(person.getPassword())) {
            throw new WrongPasswordException("подтверждение некорректно");
        } else if (person.getLogin().length() > 20) {
            throw new WrongLoginException("логин слишком длинный");
        } else if (person.getPassword().length() > 19) {
            throw new WrongPasswordException("пароль слишком длинный");
        }
    }

    public static boolean checkAuthorization (Person person){
        Person person1 = person;
        try {
            authorization(person1);
        } catch (WrongLoginException e){
            System.out.println("логин не корректен");
            return false;
        } catch (WrongPasswordException e){
            System.out.println("пароль не корректен");
            return false;
        }
        return true;
    }
}
