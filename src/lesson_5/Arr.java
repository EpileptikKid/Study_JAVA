//Добавить к классу, представляющему массив, функцию удаления последнего элемента. Добавить в функции main() ввод данных с клавиатуры

package lesson_5;

import java.util.Scanner;

public class Arr {
    private int[] arr = new int[0];

    public void setArrI(int n, int x) {
        if (n < arr.length & n >= 0) {
            arr[n] = x;
        }
    }



    public void addElement(int x) {
        int[] a = new int[arr.length + 1];
        System.arraycopy(arr, 0, a, 0, arr.length);
        a[arr.length] = x;
        arr = a;
    }

    public String toString() {
        String str = "";
        for (int i : arr) {
            str += i + " ";
        }
        return str;
    }

    public static void main(String[] args) {
        Arr arr1 = new Arr();
        arr1.addElement(12);
        arr1.addElement(13);
        arr1.addElement(2);
        arr1.addElement(5);
        arr1.setArrI(2, 14);
        System.out.println(arr1);
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        arr1.addElement(q);
        System.out.println(arr1);
    }
}
