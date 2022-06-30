package task_9;

public class ArrayOfPointObjects extends AbstractArrayOfPoints{
    private double[] arr = { };
    @Override
    public void setPoint(int i, double x, double y) {
        if (i < count()) {
            arr[i * 2] = x;
            arr[i * 2 + 1] = y;
        }
    }

    @Override
    public double getX(int i) {
        return arr[i * 2];
    }

    @Override
    public double getY(int i) {
        return arr[i * 2 +1];
    }

    @Override
    public int count() {
        return arr.length / 2;
    }

    @Override
    public void addPoint(double x, double y) {
        double[] arr1 = new double[arr.length + 2];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        arr1[arr.length] = x;
        arr1[arr.length + 1] = y;
        arr = arr1;
    }

    @Override
    public void removeLast(){
        if (count() == 0) {
            return;
        }
        double[] arr1 = new double[arr.length - 2];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        arr = arr1;
    }

    @Override
    public void sortByX() {
        for (int i = 0; i < arr.length; i+=2) {
            int minPos = i;
            for (int j = i + 2; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }
            double value = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = value;
            value = arr[minPos + 1];
            arr[minPos + 1] = arr[i + 1];
            arr[i + 1] = value;

        }
    }

    public static void main(String[] args) {
        new ArrayOfPointObjects().test();
    }
}
