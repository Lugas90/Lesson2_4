
public class Main {
    public static void main(String [] args) {

        Person vasya = new Person("Vasya", "qwerty", "qwerty");
        Validator.checkAuthorization(vasya);
    }

}