package Uebung_02;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathsTest {

    public MyMaths mymaths = new MyMaths();

    @Test
    void gcd() {
        assertEquals(1, mymaths.gcd(2, 5));
        assertEquals(1, mymaths.gcd(5, 2));
    }
}