package AbstractImadinaryNumbers;

public interface AbstractNumbersFactory {
    AbstractPutativeNumbers createNumber(double R, double U);
    ZeroRealNumbers createNumber(double U);
}
