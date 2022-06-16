package lesson_7;

public class ArrayClass<T> {
    private Object[] arr;

    @SafeVarargs
    public ArrayClass(T... arr) {
        this.arr = arr;
    }



    public int size() {
        return arr.length;
    }

    public T get(int i) {
        return (T)arr[i];
    }

    public void set(int i, T t) {
        arr[i] = t;
    }

    public void add(T t) {
        Object[] temp = new Object[arr.length + 1];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        arr[arr.length - 1] = t;
    }

    public void dell(int i) {
        if (i <= arr.length - 1) {
            Object[] temp = new Object[arr.length - 1];
            System.arraycopy(arr, 0, temp, 0, i);
            System.arraycopy(arr, i + 1, temp, i, arr.length - (i + 1));
            arr = temp;
        } else {
            System.out.println("еверньій индекс");
        }
    }



    public void addArr(T... arr1) {
        Object[] temp = new Object[arr.length + arr1.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        System.arraycopy(arr1, 0, temp, arr.length, arr1.length);
        arr = temp;
    }

    public void printAll() {
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static <T> void arrSwapElem(ArrayClass<T> arr, int i1, int i2) {
        T temp = arr.get(i1);
        arr.set(i1, arr.get(i2));
        arr.set(i2, temp);
    }

    public static <T> void arrSwap(ArrayClass<T> arr) {
        T temp;
        for (int i = 0; i < (arr.size() / 2); i++) {
            temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - i - 1));
            arr.set(arr.size() - i - 1, temp);
        }
    }

    public static <T> int contValue(ArrayClass<T> arr, T t) {
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == t) {
                temp++;
            }
        }
        return temp;
    }

}
