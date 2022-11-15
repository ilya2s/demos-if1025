package exceptions;

public class DivideByZero extends ArithmeticException {

    public DivideByZero() {
        super();
    }

    public void message() {
        System.out.println("Vous êtes bien dans la classe DivideByZero");
    }
}
