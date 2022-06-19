package Tree;

public class BinarrySearchTree<T extends Comparable<T>> extends Tree<T> {
    private Node<T> root;

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public T getMin() {
        if (isEmpty()) {
            return null;
        }

        Node<T> node = root;
        while ()
    }

}
