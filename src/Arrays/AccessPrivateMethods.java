package Arrays;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AccessPrivateMethods {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException , NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("Arrays.testaccess");
        Object o= c.newInstance();
        Method m =c.getDeclaredMethod("privateMethod", null);
        m.setAccessible(true);
        m.invoke(o, null);


        Class c1 = Class.forName("Arrays.testaccess");
        Object o1= c1.newInstance();
        Method m1 =c1.getDeclaredMethod("privateMethod1", String.class);
        m1.setAccessible(true);
        m1.invoke(o1, "Yashu");
    }
}



