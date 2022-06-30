package Volume_2;

public class DoubleLinkedList<E> {
    private class Node {
        E data;
        Node next;
        Node prev;

        Node(Node prev, E element, Node next) {
            this.prev = prev;
            this.data = element;
            this.next = next;
        }
    }

    private Node first = null;
    private Node last = null;
    private int count = 0;

    public void add(E elem) {
        Node newNode = new Node(null, elem, null);
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        count ++;
    }

    public void removeFirstOccurrence(E value) {
        if (first != null && first.data.equals(value)) {
            first = first.next;
            first.prev = null;
            count--;
        } else {
            Node link = first;
            while (link.next != null) {
                if (link.next.data.equals(value)) {
                    link.next = link.next.next;
                    count--;
                }
                if (link.prev != null && link.prev.data.equals(value)) {
                    link.prev = link.prev.prev;
                }
                if (link.next == null) {
                    last = link;
                    break;
                }
                link = link.next;
            }
        }
    }

    public final int size() {
        return count;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("size = " + size() + "\n[");
        Node link = first;
        while (link != null) {
            s.append(link.data);
            link = link.next;
            if (link != null) {
                s.append(", ");
            }
        }
        s.append("]");
        return s.toString();
    }

    public static void main(String[] args) {
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // Удаляем средний элемент
        list.removeFirstOccurrence(3);
        System.out.println(list);
        // Удаляем первый элемент:
        list.removeFirstOccurrence(1);
        System.out.println(list);
        // Удаляем последний элемент:
        list.removeFirstOccurrence(4);
        System.out.println(list);
    }
}
