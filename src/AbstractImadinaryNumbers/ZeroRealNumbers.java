package AbstractImadinaryNumbers;

public class ZeroRealNumbers extends AbstractPutativeNumbers{
    private double U;

    public ZeroRealNumbers(double U) {
        this.U = U;
    }



    @Override
    public double getU() {
        return U;
    }

    @Override
    public double getR() {
        return 0;
    }

    @Override
    public void setU(double U) {
        this.U = U;
    }

    @Override
    public void setR(double R) {

    }

    @Override
    public AbstractPutativeNumbers create(double R, double U) throws ZeroException {
        return new ZeroRealNumbers(U);
    }
}
