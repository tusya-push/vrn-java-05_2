package ru.dataart.academy.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseIntegerTest {

    @Test
    public void test() {
        assert (ReverseInteger.reverse(123) == 321);
        assert (ReverseInteger.reverse(-123) == -321);
        assert (ReverseInteger.reverse(0) == 0);
        assert (ReverseInteger.reverse(1) == 1);
        assert (ReverseInteger.reverse(-1) == -1);
        assert (ReverseInteger.reverse(120) == 21);
        assert (ReverseInteger.reverse(102) == 201);
    }

    @Test
    public void test_whenExceptionThrown() {
        Exception exception = assertThrows(RuntimeException.class, () -> ReverseInteger.reverse(1147483648));
        assertNotNull(exception.getMessage());
    }

}
