package javas.design.patterns.core.singleton;

import java.io.*;

public class SingleTonMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingleTonDateUtil s1 = SingleTonDateUtil.getInstance();
        ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(new File("src/main/resources/s1.ser")));
        oos1.writeObject(s1);

        SingleTonDateUtil s2 = null;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("src/main/resources/s1.ser")));
        s2 = (SingleTonDateUtil) ois.readObject();

        oos1.close();
        ois.close();

        System.out.println(s1 == s2);
    }
}
