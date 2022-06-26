package File_work;

import java.io.Serializable;

public class ArrayX<T> implements Serializable {
    private static final long serialVersionUID = -6262584353393720575L;
    private final T[] arr;

    public int size() {
        return arr.length;
    }

    @SafeVarargs
    public ArrayX(T... arr) {
        this.arr = arr;
    }

    public void set(int i, T t) {
        arr[i] = t;
    }

    public void printAll() {
        for (T t : arr) {
            System.out.print(t);
        }
    }


}
