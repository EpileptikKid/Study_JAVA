package AVL;

public interface Tree<T extends Comparable<T>> {
    Tree<T> insert(T data, String data2);
    void delete(T data);
    void traverse();
    T getMax(Node<T> nod);
    T getMin();
    boolean isEmpty();
}
