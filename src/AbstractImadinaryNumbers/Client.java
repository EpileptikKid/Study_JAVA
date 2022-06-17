package AbstractImadinaryNumbers;

public class Client {
    private static void printNumber(String name, AbstractPutativeNumbers num) {
        System.out.println(name + " - " + num);
    }

    private static void calc(AbstractNumbersFactory factory) {
        AbstractPutativeNumbers a = factory.createNumber(12.0, 10.0);
        AbstractPutativeNumbers b = factory.createNumber(9.0);
        printNumber("a", a);
        printNumber("b", b);
        AbstractPutativeNumbers c = AbstractPutativeNumbers.multiply(a,b);
        printNumber("c", c);
        AbstractPutativeNumbers d = AbstractPutativeNumbers.add(a, b);
        printNumber("d", d);
    }

    public static void main(String[] args) {
        System.out.println("Test");
        calc(NumberFullFactory.getInstance());
    }
}
