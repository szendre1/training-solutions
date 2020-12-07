package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathAlgorithmsTest {

    @Test
    public void isPrimeTest(){
        //MathAlgorithms ma = new MathAlgorithms();
        assertEquals(false,MathAlgorithms.isPrime(4));
        assertEquals(true,MathAlgorithms.isPrime(2));
        assertEquals(true,MathAlgorithms.isPrime(3));
        assertEquals(true,MathAlgorithms.isPrime(5));
        assertEquals(true,MathAlgorithms.isPrime(7));
        assertEquals(true,MathAlgorithms.isPrime(11));
        assertEquals(true,MathAlgorithms.isPrime(13));
        assertEquals(false,MathAlgorithms.isPrime(10));
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(1));
        assertEquals("2 és 2147483647 közötti érték adható meg.", ex.getMessage());





    }


}
