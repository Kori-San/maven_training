
package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void fact_0() {
        int expected = 1;
        int actual = new Sample().fact(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void op_add() {
        int expected = 4;
        int actual = new Sample().op(Sample.Operation.ADD, 2, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void op_mult() {
        int expected = 4;
        int actual = new Sample().op(Sample.Operation.MULT, 2, 2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_1() {
        int expected = 1;
        int actual = new Sample().fact(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_2() {
        int expected = 2;
        int actual = new Sample().fact(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_3() {
        int expected = 6;
        int actual = new Sample().fact(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_4() {
        int expected = 24;
        int actual = new Sample().fact(4);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_5() {
        int expected = 120;
        int actual = new Sample().fact(5);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fact_neg_1() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Sample().fact(-1);
        });
        Assertions.assertEquals("N should be positive", exception.getMessage());
    }

    @Test
    void fact_neg_2() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Sample().fact(-2);
        });
        Assertions.assertEquals("N should be positive", exception.getMessage());
    }

    @Test
    void fact_neg_3() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Sample().fact(-3);
        });
        Assertions.assertEquals("N should be positive", exception.getMessage());
    }

    @Test
    void fact_neg_4() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Sample().fact(-4);
        });
        Assertions.assertEquals("N should be positive", exception.getMessage());
    }

    @Test
    void fact_neg_5() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Sample().fact(-5);
        });
        Assertions.assertEquals("N should be positive", exception.getMessage());
    }
}