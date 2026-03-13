package javas.design.patterns.core.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProbelm {

    public static void main(String[] args) {
        SingleTonDateUtil s1 = SingleTonDateUtil.getInstance();
        SingleTonDateUtil s2 = null;

        Constructor[] constructors = SingleTonDateUtil.class.getDeclaredConstructors();
        for(Constructor constructor: constructors){
            constructor.setAccessible(true);
            try {
                s2 = (SingleTonDateUtil) constructor.newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
