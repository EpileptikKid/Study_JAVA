package AbstractImadinaryNumbers;

public class NumberFullFactory implements AbstractNumbersFactory{
    private static NumberFullFactory instance;

    private NumberFullFactory() {

    }

    public static NumberFullFactory getInstance() {
        if (instance == null) {
            instance = new NumberFullFactory();
        }
        return instance;
    }

    @Override
    public AbstractPutativeNumbers createNumber(double R, double U) {
        return new FullImadinaryNumbers(R, U);
    }

    @Override
    public ZeroRealNumbers createNumber(double U) {
        return new ZeroRealNumbers(U);
    }


}
