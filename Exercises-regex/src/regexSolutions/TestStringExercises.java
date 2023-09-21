package regexSolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestStringExercises {
    @ParameterizedTest
    @ValueSource(strings = {"123456789012", "12345678901234"})
    void ean13Test(String str) {
        Assertions.assertFalse(StringExercises.isValidEan13Code(str));
    }

    @Test
    void ean13TrueTest() {
        Assertions.assertTrue(StringExercises.isValidEan13Code("1234567890123"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+393000000000", "+3931111111111"})
    void itPhoneNr(String str) {
        Assertions.assertTrue(StringExercises.isItValidPhoneNr(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "Hello", "hElLo", "HELLO", "WORLD", "WoRlD", "World", "world"})
    void textTester(String str) {
        Assertions.assertTrue(StringExercises.isWorldOrHello(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcQWaB93*,;-:.", "#&@ASef93*,;-:.", "abcQWaB93_><?/."})
    void specCodeTest(String str) {
        Assertions.assertTrue(StringExercises.isSpecialCode(str));
    }
}
