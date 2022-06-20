package AVL;


public class AvlTree<T extends Comparable<T>> implements Tree<T> {
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
    public Tree<T> insert(T data, String data2) {
        root = insert(data, root, data2);
        return this;
    }

    private Node<T> insert(T data, Node<T> node, String data2) {
        if (node == null) {
            return new Node<>(data, data2);
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftChild(insert(data, node.getLeftChild(), data2));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightChild(insert(data, node.getRightChild(), data2));
        } else {
            return node;
        }
        updateHeight(node);
        return applyRotation(node);
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
        updateHeight(node);
        return applyRotation(node);
    }


    private void updateHeight(Node<T> node) {
        int maxHeight = Math.max(height(node.getLeftChild()), height(node.getRightChild()));
        node.setHeight(maxHeight + 1);
    }

    private int height(Node<T> node) {
        return node != null ? node.getHeight() : 0;
    }

    private Node<T> applyRotation(Node<T> node) {
        int balance = balance(node);
        if (balance > 1) {
            if (balance(node.getLeftChild()) < 0) {
                node.setLeftChild(rotateLeft(node.getLeftChild()));
            }
            return rotateRight(node);
        }
        if (balance < -1) {
            if (balance(node.getRightChild()) > 0) {
                node.setRightChild((rotateRight(node.getRightChild())));
            }
            return rotateLeft(node);
        }
        return node;
    }

    private Node<T> rotateRight(Node<T> node) {
        Node<T> leftNode = node.getLeftChild();
        Node<T> centerNode = leftNode.getRightChild();
        leftNode.setRightChild(node);
        node.setLeftChild(centerNode);
        updateHeight(node);
        updateHeight(leftNode);
        return leftNode;
    }

    private Node<T> rotateLeft(Node<T> node) {
        Node<T> rightNode = node.getRightChild();
        Node<T> centerNode = rightNode.getLeftChild();
        rightNode.setLeftChild(node);
        node.setRightChild(centerNode);
        updateHeight(node);
        updateHeight(rightNode);
        return rightNode;
    }

    private int balance(Node<T> node) {
        return node != null
                ? height(node.getLeftChild()) - height(node.getRightChild())
                : 0;
    }

    public static void main(String[] args) {
        AvlTree<Integer> tree = new AvlTree<>();
        tree.insert(1, "abo");
        tree.insert(2, "abt");
        tree.insert(3, "abf");
        tree.insert(4, "abf");
        tree.insert(5, "abf i");
        tree.insert(6, "abs");
        tree.insert(7, "abuse");
        tree.insert(8, "above");
        tree.insert(9, "abs");
        tree.insert(10, "abate");
        tree.insert(11, "level");
        tree.insert(12, "tabview");
        tree.insert(13, "abs");
        tree.insert(14, "biff");
        tree.insert(15, "abusive");
        tree.delete(4);

        tree.traverse();
        System.out.println(tree.root.getLeftChild());
    }


}
