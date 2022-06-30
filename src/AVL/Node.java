package AVL;
import com.sun.istack.internal.NotNull;

public class Node<T extends Comparable<T>> {

    @NotNull private T data;
    private String dataString;
    private Node<T> leftChild;
    private Node<T> rightChild;

    private int height = 1;

    public void setHeight(int i) {
        height = i;
    }

    public int getHeight() {
        return height;
    }

    public Node(T data, String dataString) {
        this.data = data; this.dataString = dataString;
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

    public String getDataString() {
        return dataString;
    }

    public void setDataString(String dataString) {
        this.dataString = dataString;
    }

    @Override
    public String toString() {
        return this.getData() + " " + this.getDataString();
    }
}

