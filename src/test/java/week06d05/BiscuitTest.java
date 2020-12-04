package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week06d05.Biscuit.of;

public class BiscuitTest {


    @Test
    public void btest(){
        Biscuit keksz=new Biscuit();
        Biscuit keksz1=Biscuit.of(BiscuitType.ALBERT,100);
        Biscuit keksz2=of(BiscuitType.OREO,300);
        Biscuit keksz3=of(BiscuitType.PILÓTA,500);

        assertEquals("Biscuit{biscuitType=ALBERT, gramAmount=100}",keksz1.toString());
        assertEquals("Biscuit{biscuitType=OREO, gramAmount=300}",keksz2.toString());
        assertEquals("Biscuit{biscuitType=PILÓTA, gramAmount=500}",keksz3.toString());
    }


}
