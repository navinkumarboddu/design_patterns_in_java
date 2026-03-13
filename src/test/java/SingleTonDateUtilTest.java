import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javas.design.patterns.core.singleton.SingleTonDateUtil;

public class SingleTonDateUtilTest {

    @Test
    public void testSingleTon(){
        SingleTonDateUtil s1 = SingleTonDateUtil.getInstance();
        SingleTonDateUtil s2 = SingleTonDateUtil.getInstance();

        Assertions.assertEquals(s1, s2);

    }

    @Test
    public void testSingleTonThread(){

    }
}
