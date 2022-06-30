package task_9;

import java.util.ArrayList;

public class ListOfPoints extends AbstractArrayOfPoints{
    ArrayList<Double> arr = new ArrayList<>();


    @Override
    public void setPoint(int i, double x, double y) {
        arr.add(i*2, x);
        arr.add(i * 2 + 1, y);
    }

    @Override
    public double getX(int i) {
        return arr.get(i * 2);
    }

    @Override
    public double getY(int i) {
        return arr.get(i * 2 + 1);
    }

    @Override
    public int count() {
        return arr.size() / 2;
    }

    @Override
    public void addPoint(double x, double y) {
        arr.add(x);
        arr.add(y);
    }

    @Override
    public void sortByX() {
        for (int i = 0; i < arr.size() / 2; i++) {
            int min = i;
            for (int j = i + 1; j < arr.size() / 2; j++) {
                if (arr.get(j * 2) < arr.get(i * 2)) {
                    min = j;
                }
            }
            double temp = arr.get(i * 2);
            arr.set(i * 2, arr.get(min * 2));
            arr.set(min * 2, temp);
            temp = arr.get(i * 2 + 1);
            arr.set(i * 2 + 1, arr.get(min * 2 + 1));
            arr.set(min * 2 + 1, temp);
        }
    }

    @Override
    public void removeLast() {
        arr.remove(arr.size() - 1);
        arr.remove(arr.size() - 2);
    }


    public static void main(String[] args) {
        new ListOfPoints().test();
    }


}
