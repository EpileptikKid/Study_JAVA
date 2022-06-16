package lesson_7;

public class ArrNumber {
    public static <T extends Number> int firstZero(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].doubleValue() == 0) {
                return i;
            }
        }
        return -1;
    }

    public static <T extends Number> int countNegative(T[] arr) {
        int count = 0;
        for (T t : arr) {
            if (t.doubleValue() < 0) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Number> T lastNegative(T[] arr) {
        T last = arr[0];
        for (T t : arr) {
            if (t.doubleValue() < 0) {
                last = t;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        Integer [] a = {3, 2, -1, -0, 1, -2, 0};
        Double [] b = {3.0, 2.0, -3.0, 3.0, 0.0, -1.0, 0.0};
        System.out.println(firstZero(a) + " " + countNegative(a) + " " + lastNegative(a));
        System.out.println(firstZero(b) + " " + countNegative(b) + " " + lastNegative(b));
    }
}
