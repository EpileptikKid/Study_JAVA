package task_8;

public class AbstractArrayOfPoints {
    static Double[][] arrPoint;

    public AbstractArrayOfPoints(Double[][] arrPoint) {
        this.arrPoint = arrPoint;
    }

    public AbstractArrayOfPoints() {
        arrPoint = new Double[0][0];
    }

    public void addPoint(Double x, Double y) {
        Double[][] arr = new Double[arrPoint.length + 1][2];
        for (int i = 0; i < arrPoint.length; i++) {
            System.arraycopy(arrPoint[i], 0, arr[i], 0, 2);
        }
        System.arraycopy(arrPoint, 0, arr, 0, arrPoint.length);
        arr[arrPoint.length][0] = x;
        arr[arrPoint.length][1] = y;
        arrPoint = arr;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < arrPoint.length; i++) {
            str += "x = " + arrPoint[i][0] + ", y = " + arrPoint[i][1] + ";\n";
        }
        return str;
    }

    public static void main(String[] args) {
        AbstractArrayOfPoints arr = new AbstractArrayOfPoints();
        arr.addPoint(12.1, 2.0);
        arr.addPoint(3.1, 5.0);
        System.out.println(arr);
    }
}
