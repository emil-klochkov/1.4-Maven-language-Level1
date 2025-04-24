package org.example.Ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIndexOutOfBoundsExampleTest {

    @Test
    void testTriggerArrayIndexOutOfBoundsException() {
        assertThrows(ArrayIndexOutOfBoundsException.class, ArrayIndexOutOfBoundsExample::triggerArrayIndexOutOfBoundsException);
    }
}