package lesson_7;

import java.util.Arrays;

public class LastTask {
    public static class IndexException extends Exception {
        private final int index1, index2;

        public IndexException(int index1, int index2) {
            super();
            this.index1 = index1;
            this.index2 = index2;
        }

        public int getIndex1() {
            return index1;
        }

        public int getIndex2() {
            return index2;
        }

    }

    public static <E> void swapElem(E[] arr, int index1, int index2) throws IndexException {
        if (index1 < 0 || index1 >= arr.length || index2 < 0 || index2 >= arr.length) {
            throw new IndexException(index1, index2);
        }
        E temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        Double[] b = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0};

        try {
            swapElem(a, 2, 5);
            swapElem(b, 2, 100);
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        }
        catch (IndexException e) {
            System.err.println(e.getClass().getName() + "  index one - " + e.getIndex1() + ", index two - " + e.getIndex2());
        }
    }
}
