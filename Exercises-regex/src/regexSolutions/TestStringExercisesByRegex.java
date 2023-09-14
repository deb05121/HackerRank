package regexSolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestStringExercisesByRegex {
    @ParameterizedTest
    @ValueSource(strings = {"123456789012", "12345678901234"})
    void ean13Test(String str) {
        Assertions.assertFalse(StringExercisesByRegex.Ean13Checker(str));
    }

    @Test
    void ean13TrueTest() {
        Assertions.assertTrue(StringExercisesByRegex.Ean13Checker("1234567890123"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+393000000000", "+3931111111111"})
    void itPhoneNr(String str) {
        Assertions.assertTrue(StringExercisesByRegex.itPhoneChecker(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "Hello", "HELLO", "WORLD", "World", "world", "hElLo", "WoRlD"})
    void textTester(String str) {
        Assertions.assertTrue(StringExercisesByRegex.textChecker(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcQWaB93*,;-:.", "#&@ASef93*,;-:.", "abcQWaB93_><?/."})
    void specCodeTest(String str) {
        Assertions.assertTrue(StringExercisesByRegex.specCodeChecker(str));
    }
}
