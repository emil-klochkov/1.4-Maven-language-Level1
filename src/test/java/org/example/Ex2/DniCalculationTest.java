package org.example.Ex2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniCalculationTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "23456789, P",
            "34567890, C",
            "45678901, G",
            "56789012, K",
            "67890123, N",
            "78901234, M",
            "89012345, Q",
            "90123456, R",
            "11223344, X"
    })
    void testCalculateDniLetter(int dniNumber, char expectedLetter) {
        char result = DniCalculation.calculateDniLetter(dniNumber);
        assertEquals(expectedLetter, result,
                () -> "Expected letter for DNI " + dniNumber + " is " + expectedLetter + " but got " + result);
    }
}