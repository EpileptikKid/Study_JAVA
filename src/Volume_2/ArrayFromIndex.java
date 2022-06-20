package Volume_2;

import java.util.ArrayList;
import java.util.AbstractList;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class ArrayFromIndex<E> extends AbstractList<E> {
    ArrayList<Object> arr = new ArrayList<>();
    private int startIndex = 0;

    @Override
    public E get(int index) {
        return (E)arr.get(index - startIndex);
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public void add(int index, E element) {
        arr.add(index - startIndex, element);
    }

    @Override
    public boolean add(E e) {
        return arr.add(e);
    }

    @Override
    public E set(int index, E element) {
        return (E)arr.set(index - startIndex, element);
    }

    @Override
    public E remove(int index) {
        return (E)arr.remove(index - startIndex);
    }

    @Override
    public int indexOf(Object o) {
        return arr.indexOf(o) + startIndex;
    }

    @Override
    public int lastIndexOf(Object o) {
        return arr.lastIndexOf(o) + startIndex;
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>)arr.iterator();
    }

    public void setIndex(int index) {
        startIndex = index;
    }

    public static void main(String[] args) {
        ArrayFromIndex<Integer> arr = new ArrayFromIndex<>();
        arr.setIndex(5);
        arr.add(1);
        arr.add(2);
        System.out.println(arr.get(5) + " " + arr.get(6));
        System.out.println(arr.indexOf(2));
    }

}
