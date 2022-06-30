package File_work.RTTI;

import java.lang.reflect.Method;

public class Task_2 {
    public static void main(String[] args) throws Exception {
        String className = "File_work.RTTI.TestClass";
        Class<?> cls = Class.forName(className);
        Method method = cls.getMethod("printClass");
        System.out.println(cls.getName());
        method.invoke(null);

    }
}
