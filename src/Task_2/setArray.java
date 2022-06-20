package Task_2;


public class setArray<T extends Comparable<T>> {
    private Object[] arr;

    @SafeVarargs
    public setArray(T... arr) {
        this.arr = arr;
    }

    public int size() {
        return arr.length;
    }

    public T get(int i) {
        return (T) arr[i];
    }

    public void set(int i, T elem) {
        if (i >= arr.length) {
            Object[] arr1 = new Object[i + 1];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
        arr[i] = elem;
    }

    public void add(T elem) {
        Object[] arr1 = new Object[arr.length + 1];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        arr = arr1;
        arr[arr.length - 1] = elem;
    }

    public void deleteLast() {
        Object[] arr1 = new Object[arr.length - 1];
        System.arraycopy(arr, 0, arr1, 0, arr.length - 1);
        arr = arr1;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Object o : arr) {
            s.append(o).append(" ");
        }
        s.append("\n");
        return s.toString();
    }
}

class test {
    public static void main(String[] args) {
        setArray<Integer> arr = new setArray<>();
        arr.add(12);
        System.out.println(arr.size());
        arr.add(13);
        arr.set(5, 10);
        System.out.println(arr.size());
        arr.add(11);
        System.out.println(arr.size());
        arr.deleteLast();
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
