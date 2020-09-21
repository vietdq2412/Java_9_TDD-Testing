import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {
    @Test
    @DisplayName("1/1/2018")
    void testDay1Month1Year2018() {
        int dayTest = 1;
        int monthTest = 1;
        int yearTest = 2018;
        String rs = NextDay.nextDayCalculator( dayTest, monthTest, yearTest);
        String expected = "2/1/2018";
        assertEquals(expected, rs);

    }

    @Test
    @DisplayName("31/1/2018")
    void testDay31Month1Year2018() {
        int dayTest = 31;
        int monthTest = 1;
        int yearTest = 2018;
        String rs = NextDay.nextDayCalculator( dayTest, monthTest, yearTest);
        String expected = "1/2/2018";
        assertEquals(expected, rs);

    }
    @Test
    @DisplayName("30/4/2018")
    void testDay30Month4Year2018() {
        int dayTest = 30;
        int monthTest = 4;
        int yearTest = 2018;
        String rs = NextDay.nextDayCalculator( dayTest, monthTest, yearTest);
        String expected = "1/5/2018";
        assertEquals(expected, rs);

    }

    @Test
    @DisplayName("28/2/2018")
    void testDay28Month2Year2018() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2018;
        String rs = NextDay.nextDayCalculator( dayTest, monthTest, yearTest);
        String expected = "1/3/2018";
        assertEquals(expected, rs);

    }

    @Test
    @DisplayName("29/2/2020")
    void testDay29Month2Year2020() {
        int dayTest = 29;
        int monthTest = 2;
        int yearTest = 2020;
        String rs = NextDay.nextDayCalculator( dayTest, monthTest, yearTest);
        String expected = "1/3/2020";
        assertEquals(expected, rs);

    }

    @Test
    @DisplayName("28/2/2020")
    void testDay28Month2Year2020() {
        int dayTest = 28;
        int monthTest = 2;
        int yearTest = 2020;
        String rs = NextDay.nextDayCalculator( dayTest, monthTest, yearTest);
        String expected = "29/2/2020";
        assertEquals(expected, rs);

    }

    @Test
    @DisplayName("31/12/2018")
    void testDay31Month12Year2018() {
        int dayTest = 31;
        int monthTest = 12;
        int yearTest = 2018;
        String rs = NextDay.nextDayCalculator( dayTest, monthTest, yearTest);
        String expected = "1/1/2019";
        assertEquals(expected, rs);

    }
}