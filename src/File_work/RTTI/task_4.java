package File_work.RTTI;


import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.Scanner;

public class task_4 {
    final String sourcefile = "src/File_work/RTTI/MathFun.java";

    void genSource(String expression) {
        try (PrintWriter out = new PrintWriter(sourcefile)) {
            out.println("package File_work.RTTI;");
            out.println("public class MathFun {");
            out.println("  public static Double transform() {");
            out.println("    return Double.valueOf(" + expression + ");");
            out.println("  }");
            out.println("}");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        task_4 sp = new task_4();
        Scanner scan = new Scanner(System.in);
        System.out.println("print vars");
        String expression = scan.nextLine();
        sp.genSource(expression);
        try {

                Class<?> cls = Class.forName("File_work.RTTI.MathFun");
                Method m = cls.getMethod("transform");
                System.out.println(m.invoke(null));

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
