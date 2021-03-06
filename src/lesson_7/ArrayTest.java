package lesson_7;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayClass<Integer> a = new ArrayClass<>(1, 2, 3);
        ArrayClass<Double> c = new ArrayClass<>(1.1, 2.2, 3.3);
        Integer[] c1 = {1, 2, 4, 8, 0, -22};

        int i = a.get(2);
        System.out.println(i);
        a.set(1, 10);
        a.printAll();
        a.dell(2);
        a.printAll();
        a.addArr(9, 9, 0, 7, 3);
        ArrayClass.arrSwapElem(a, 1, 4);
        a.printAll();
        ArrayClass.arrSwap(a);
        System.out.println(ArrayClass.contValue(a, 9));

        ArrayClass.addNumbers(a, c1);
        a.printAll();
        ArrayClass.addNumbers(c, c1);
        c.printAll();
    }
}
