package Volume_2;

public class BinaryTree {
    public static class Node {
        int key;
        String value;
        Node leftChild;
        Node rightChild;

        Node(int key, String name) {
            this.key = key;
            this.value = name;
        }

        @Override
        public String toString() {
            return "Key: " + key + " Value: " + value;
        }
    }

    private Node root;

    public void addNode(int key, String value) {
        Node newNode = new Node(key, value);
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parent;
            while (true) {
                parent = currentNode;
                if (key < currentNode.key) {
                    currentNode = currentNode.leftChild;
                    if (currentNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;
                    if (currentNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void traverseTree(Node currentNode) {
        if (currentNode != null) {
            traverseTree(currentNode.leftChild);
            System.out.println(currentNode);
            traverseTree(currentNode.rightChild);
        }
    }

    public void traverseTree() {
        traverseTree(root);
    }

    public Node findNode(int key) {
        Node focusNode = root;
        while (key != focusNode.key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    private Node findParent(int key) {
        Node focusNode = root;
        Node parentNode = root;
        while (key != focusNode.key) {
            if (key < focusNode.key) {
                parentNode = focusNode;
                focusNode = focusNode.leftChild;
            } else {
                parentNode = focusNode;
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return parentNode;
    }

    public void deleteNode(int key) {
        if (key == root.key) {
            System.out.println("nel'zya udalit' koren'");
            return;
        }
        Node delNode = findNode(key);
        Node parent = findParent(key);
        if (delNode.leftChild == null && delNode.rightChild == null) {
            if (parent.key > key) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
            return;
        }
        if (delNode.rightChild == null) {
            if (parent.key > delNode.key) {
                parent.leftChild = delNode.leftChild;
            } else {
                parent.rightChild = delNode.leftChild;
            }
            return;
        }
        if (parent.key < delNode.key) {
            parent.rightChild = delNode.rightChild;
        } else {
            parent.leftChild = delNode.rightChild;
        }
        if (delNode.leftChild == null) { return; }


        Node focusNode = delNode.rightChild;
        while (true) {
            if (focusNode.leftChild != null) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode.leftChild = delNode.leftChild;
                return;
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree continents = new BinaryTree();
        continents.addNode(4, "????????????");
        continents.addNode(2, "????????????");
        continents.addNode(6, "??????????????????");
        continents.addNode(1, "??????????????");
        continents.addNode(3, "????????");
        continents.addNode(5, "????????????????????");
        continents.addNode(7, "??????????????????");
        continents.traverseTree();
        System.out.println("\n?????????????????? ?? ???????????????? 5:");
        System.out.println(continents.findParent(5));
        System.out.println("\n?????????????????? ?? ???????????? 4:");
        System.out.println(continents.findNode(4));

        continents.deleteNode(6);
        System.out.println("\n????????????e???????? ?????? ?????????? 6");
        continents.traverseTree();
        System.out.println("\n?????????????????? ?? ???????????????? 5:");
        System.out.println(continents.findParent(5));
    }
}
