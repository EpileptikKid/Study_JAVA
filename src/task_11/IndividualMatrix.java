package task_11;

import java.util.Arrays;

public class IndividualMatrix {
    private String name;
    private double[][] matrix;



    public IndividualMatrix(String name, double[][] matrix) {
        this.matrix = Arrays.copyOf(matrix, matrix.length);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = Arrays.copyOf(matrix, matrix.length);
    }

    public boolean equalsM(IndividualMatrix matrix) {
        for (int i = 0; i < matrix.getMatrix().length; i++) {
            if (!Arrays.equals(this.matrix[i], matrix.getMatrix()[i])) {
                return false;
            }
        }
        if (this.name != matrix.getName()) {
            return false;
        }
        return true;
    }

    public static void clone(IndividualMatrix a1, IndividualMatrix a2) {
        a1.setMatrix(a2.getMatrix());
        a1.setName(a2.getName());
    }

    public static void main(String[] args) {
        double[][] a = new double[3][2];
        double[][] b = new double[3][2];

        String x1 = "aa", x2 = "aa";

        IndividualMatrix m1 = new IndividualMatrix(x1, a);
        IndividualMatrix m2 = new IndividualMatrix(x2, b);
        System.out.println(m1.equalsM(m2));
        b[1][1] = 2;
        m2.setMatrix(b);

        System.out.println(m1.equalsM(m2));
        clone(m1, m2);
        System.out.println(m1.equalsM(m2));
    }

}
