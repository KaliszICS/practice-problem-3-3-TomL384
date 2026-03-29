/**
 * File Name: Else if
 * Author: Tom Leung
 * Date Created: March 25, 2026
 * Date Last Edited: March 29, 2026
 */


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeProblemTest {

    // ─────────────────────────────────────────────
    // evenOrOdd() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("evenOrOdd: even number returns 'Even'")
    void evenOrOddTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Even", (String) method.invoke(null, 4));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: odd number returns 'Odd'")
    void evenOrOddTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Odd", (String) method.invoke(null, 7));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: zero returns 'Zero'")
    void evenOrOddTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Zero", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: negative even number returns 'Even'")
    void evenOrOddTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Even", (String) method.invoke(null, -8));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("evenOrOdd: negative odd number returns 'Odd'")
    void evenOrOddTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("evenOrOdd", cArg);
            assertEquals("Odd", (String) method.invoke(null, -3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    // positiveOrNegative() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("positiveOrNegative: positive number returns 'Positive'")
    void positiveOrNegativeTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Positive", (String) method.invoke(null, 5));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("positiveOrNegative: negative number returns 'Negative'")
    void positiveOrNegativeTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Negative", (String) method.invoke(null, -9));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("positiveOrNegative: zero returns 'Zero'")
    void positiveOrNegativeTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Zero", (String) method.invoke(null, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("positiveOrNegative: large positive number returns 'Positive'")
    void positiveOrNegativeTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Positive", (String) method.invoke(null, 1000));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("positiveOrNegative: large negative number returns 'Negative'")
    void positiveOrNegativeTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class };
            Method method = testClass.getDeclaredMethod("positiveOrNegative", cArg);
            assertEquals("Negative", (String) method.invoke(null, -1000));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    // pluralize() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("pluralize: word ending in 'y' returns 'ies'")
    void pluralizeTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("ies", (String) method.invoke(null, "baby"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pluralize: word ending in 'ey' returns 'eys'")
    void pluralizeTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("eys", (String) method.invoke(null, "monkey"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pluralize: word ending in 'ife' returns 'ives'")
    void pluralizeTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("ives", (String) method.invoke(null, "knife"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pluralize: word with no special ending returns 's'")
    void pluralizeTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("s", (String) method.invoke(null, "cat"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pluralize: uppercase 'Y' ending returns 'ies' (case-insensitive)")
    void pluralizeTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("ies", (String) method.invoke(null, "BABY"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pluralize: uppercase 'EY' ending returns 'eys' (case-insensitive)")
    void pluralizeTest6() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("eys", (String) method.invoke(null, "TURKEY"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pluralize: uppercase 'IFE' ending returns 'ives' (case-insensitive)")
    void pluralizeTest7() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("ives", (String) method.invoke(null, "WIFE"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("pluralize: mixed case 'eY' ending returns 'eys' (case-insensitive)")
    void pluralizeTest8() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("pluralize", cArg);
            assertEquals("eys", (String) method.invoke(null, "doNkeY"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}