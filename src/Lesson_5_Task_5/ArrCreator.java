package Lesson_5_Task_5;

public class ArrCreator implements AutoCloseable {
    private final double[] arr = new double[5];
    private String[] arrS = new String[5];

    public void add(int i, double value) {
        arr[i] = value;
    }

    public void addS(int i, String value) {
        if (i >= arrS.length) {
            String[] arrS1 = new String[i+1];
            System.arraycopy(arrS, 0, arrS1, 0, arrS.length);
            arrS = arrS1;
        }
        arrS[i] = value;
    }

    public String printAll() {
        String res = "";
        for (int i = 0; i < arrS.length; i++) {
            if (i < arr.length && arr[i] != 0.0) {
                res += i + " - " + arr[i] + ", ";
            } else if (arrS[i] != null) {
                res += "(" + i + " - " + arrS[i] + "), ";
            }
        }
        return res;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Ошибочньій индекс или число");
    }
}
