package Assignment81.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void testConcatenate() {
        StringManipulator sm = new StringManipulator("Hello", "World", "", "");
        assertEquals("HelloWorld", sm.concatenate());

        sm = new StringManipulator("", "World", "", "");
        assertEquals("enter valid string", sm.concatenate());

        sm = new StringManipulator("Hello", "", "", "");
        assertEquals("enter valid string", sm.concatenate());
    }

    @Test
    void testFindLength() {
        StringManipulator sm = new StringManipulator("", "", "Hello", "");
        assertEquals(5, sm.findLength());

        sm = new StringManipulator("", "", "", "");
        assertEquals(0, sm.findLength());
    }

    @Test
    void testConvertToUpperCase() {
        StringManipulator sm = new StringManipulator("", "", "hello", "");
        assertEquals("HELLO", sm.convertToUpperCase());

        sm = new StringManipulator("", "", "Hello World", "");
        assertEquals("HELLO WORLD", sm.convertToUpperCase());
    }

    @Test
    void testConvertToLowerCase() {
        StringManipulator sm = new StringManipulator("", "", "HELLO", "");
        assertEquals("hello", sm.convertToLowerCase());

        sm = new StringManipulator("", "", "Hello World", "");
        assertEquals("hello world", sm.convertToLowerCase());
    }

    @Test
    void testContainsSubstring() {
        StringManipulator sm = new StringManipulator("", "", "Hello World", "World");
        assertTrue(sm.containsSubstring());

        sm = new StringManipulator("", "", "Hello World", "world");
        assertFalse(sm.containsSubstring());
    }
}