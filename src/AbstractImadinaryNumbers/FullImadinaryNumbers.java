package AbstractImadinaryNumbers;

public class FullImadinaryNumbers extends AbstractPutativeNumbers{
    private double R, U;

    public FullImadinaryNumbers(double R, double U) {
        this.R = R;
        this.U = U;
    }



    @Override
    public double getR() {
        return R;
    }

    @Override
    public double getU() {
        return U;
    }

    @Override
    public void setR(double R) {
        this.R = R;
    }

    @Override
    public void setU(double U) {
        this.U = U;
    }

    @Override
    public AbstractPutativeNumbers create(double R, double U) throws ZeroException {
        return new FullImadinaryNumbers(R, U);
    }
}
