package Tree;


public class BinarrySearchTree<T extends Comparable<T>> implements Tree<T> {
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
        while (node.getLeftChild() != null) {
            node = node.getLeftChild();
        }
        return node.getData();
    }

    @Override
    public T getMax(Node<T> nod) {
        if (isEmpty()) {
            return null;
        }
        Node<T> node = nod;
        while (node.getRightChild() != null) {
            node = node.getRightChild();
        }
        return node.getData();
    }

    @Override
    public void traverse() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node<T> node) {
        if (node != null) {
            traverseInOrder(node.getLeftChild());
            System.out.println(node);
            traverseInOrder(node.getRightChild());
        }
    }

    @Override
    public Tree<T> insert(T data) {
        root = insert(data, root);
        return this;
    }

    private Node<T> insert(T data, Node<T> node) {
        if (node == null) {
            return new Node<>(data);
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftChild(insert(data, node.getLeftChild()));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightChild(insert(data, node.getRightChild()));
        }
        return node;
    }

    @Override
    public void delete(T data) {
        root = delete(data, root);
    }

    private Node<T> delete(T data, Node<T> node) {
        if (node == null) {
            return null;
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftChild(delete(data, node.getLeftChild()));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightChild(delete(data, node.getRightChild()));
        } else {
            //One child
                if (node.getLeftChild() == null) {
                return node.getRightChild();
            } else if (node.getRightChild() == null) {
                return node.getLeftChild();
            }
            //Two children
            node.setData(getMax(node.getLeftChild()));
            node.setLeftChild(delete(node.getData(), node.getLeftChild()));
        }
        return node;
    }

    public static void main(String[] args) {
        BinarrySearchTree<Integer> tree = new BinarrySearchTree<Integer>();
        tree.insert(8);
        tree.insert(4);
        tree.insert(12);
        tree.insert(2);
        tree.insert(6);
        tree.insert(10);
        tree.insert(14);
        tree.insert(1);
        tree.insert(3);
        tree.insert(5);
        tree.insert(7);
        tree.insert(9);
        tree.insert(11);
        tree.insert(13);
        tree.insert(15);
        tree.delete(4);
        System.out.println(tree.getMax(tree.root.getLeftChild().getLeftChild()));
    }
}
