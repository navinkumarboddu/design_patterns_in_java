package javas.design.patterns.core.singleton;

import java.io.Serial;
import java.io.Serializable;

public class SingleTonDateUtil implements Serializable, Cloneable {

    private static SingleTonDateUtil instance;

    private SingleTonDateUtil(){}

    public  static SingleTonDateUtil getInstance(){
        //add synchronized to make thread safe
        //get the synchronized lock on block of code
        if(instance == null) { //Double Checking
            synchronized (SingleTonDateUtil.class) {
                if (instance == null) {
                    instance = new SingleTonDateUtil();
                }
            }
        }
        return instance;
    }

    @Serial
    public Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
