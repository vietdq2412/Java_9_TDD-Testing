import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberTest {


    @org.junit.jupiter.api.Test
    void testFindAbsoluteOf0() {
        int number = 0;
        int expected = 0;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testFindAbsoluteOf1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void testFindAbsoluteOfNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }


    @org.junit.jupiter.api.Test
    void testFindAbsoluteOfMaxInt() {
        int number = Integer.MAX_VALUE + 1;
        int expected = -0;

        int result = AbsoluteNumber.findAbsolute(number);
        assertEquals(expected, result);
    }


}
