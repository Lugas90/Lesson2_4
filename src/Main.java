import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static void checkAuthorization (Person person){
        try {
            Person.authorization(person);
        } catch (WrongLoginException e){
            System.out.println("логин не корректен");
        } catch (WrongPasswordException e){
            System.out.println("пароль не корректен");
        }
    }
    public static void main(String [] args) {
        Person vasya = new Person("Vasya", "qwerty", "qwerty");
        checkAuthorization(vasya);
    }

}