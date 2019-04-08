package w9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDemoTest {

    @Test
    void testMultipleOf15() {
        assertEquals("fizzbuzz", TestDemo.fizzbuzz(15), "Multiples of 15 should output fizzbuzz" );
    }
}