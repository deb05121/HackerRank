package regexSolutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestStringExercisesByRegex {
    @ParameterizedTest
    @ValueSource(strings = {"123456789012", "12345678901234"})
    void ean13TestFalse(String str) {
        Assertions.assertFalse(StringExercisesByRegex.isItValidEan13Code(str));
    }

    @Test
    void ean13TrueTestTrue() {
        Assertions.assertTrue(StringExercisesByRegex.isItValidEan13Code("1234567890123"));
    }


    @ParameterizedTest
    @ValueSource(strings = {"+39323456789", "+393234567890"})
    void itPhoneNrTrue(String str) {
        Assertions.assertTrue(StringExercisesByRegex.isItValidPhoneNumber(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"+3932345678", "+3932345678901"})
    void itPhoneNrFalse(String str) {
        Assertions.assertFalse(StringExercisesByRegex.isItValidPhoneNumber(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "Hello", "HELLO", "WORLD", "World", "world", "hElLo", "WoRlD"})
    void textTesterTrue(String str) {
        Assertions.assertTrue(StringExercisesByRegex.textChecker(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ello", "Hllo", "hELo", "HELL", "ORLD", "WRlD", "Wold", "word"})
    void textTesterFalse(String str) {
        Assertions.assertFalse(StringExercises.isWorldOrHello(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcQWaB93*,;-:.", "#&@ASef03*,;-:.", "abcQWaB91_><?/."})
    void specCodeTestTrue(String str) {
        Assertions.assertTrue(StringExercisesByRegex.isItSpecCode(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a2cQWaB93*,;-:.", "#&@aSef03*,;-:.", "abcQWaB98_><?/."})
    void specCodeTestFalse(String str) {
        Assertions.assertFalse(StringExercisesByRegex.isItSpecCode(str));
    }
}
