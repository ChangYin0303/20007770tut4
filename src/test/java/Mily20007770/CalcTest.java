package Mily20007770;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void add() {
        int c = 5;
        int d = 2;
        int e = Calc.add(c,d);
        assertEquals(7,e);
    }

    @Test
    void subtract() {
    }
}