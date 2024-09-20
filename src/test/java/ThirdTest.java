import org.example.third_task.Third;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdTest {
    @Test
    public void testExample1() {
        Third solution = new Third();
        String s = "abcabcbb";
        int expected = 3;
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testExample2() {
        Third solution = new Third();
        String s = "bbbbb";
        int expected = 1;
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testExample3() {
        Third solution = new Third();
        String s = "pwwkew";
        int expected = 3;
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testEmptyString() {
        Third solution = new Third();
        String s = "";
        int expected = 0;
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testSingleCharacterString() {
        Third solution = new Third();
        String s = "a";
        int expected = 1;
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testStringWithAllUniqueCharacters() {
        Third solution = new Third();
        String s = "abcdef";
        int expected = 6;
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testStringWithSpecialCharacters() {
        Third solution = new Third();
        String s = "abc!@#abc";
        int expected = 6;
        assertEquals(expected, solution.lengthOfLongestSubstring(s));
    }
}

