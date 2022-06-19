package AVL;
import com.sun.istack.internal.NotNull;

public class Node<T extends Comparable<T>> {

    @NotNull private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;

    private int height = 1;

    public void setHeight(int i) {
        height = i;
    }

    public int getHeight() {
        return height;
    }

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setLeftChild(Node<T> node) {
        leftChild = node;
    }

    public void setRightChild(Node<T> node) {
        rightChild = node;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getData());
    }
}

