package javas.design.patterns.core.singleton;

public class TestEnumSingleton {

    public static void main(String[] args) {
        EnumSingletonDemo s1 = EnumSingletonDemo.INSTANCE;
        System.out.println(s1.getName());
        s1.setName("Navin");
        System.out.println(s1.getName());
    }
}
