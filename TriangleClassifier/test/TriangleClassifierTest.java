import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangleClassifier222() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;

        String rs = TriangleClassifier.triangleClassifier(sideA,sideB,sideC);
        String expected = TriangleClassifier.EQUILATERAL_TRIANGLE;
        assertEquals(expected, rs);
    }

    @Test
    void testTriangleClassifier223() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;

        String rs = TriangleClassifier.triangleClassifier(sideA,sideB,sideC);
        String expected = TriangleClassifier.ISOSCELES_TRIANGLE;
        assertEquals(expected, rs);
    }

    @Test
    void testTriangleClassifier345() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        String rs = TriangleClassifier.triangleClassifier(sideA,sideB,sideC);
        String expected = TriangleClassifier.NORMAL_TRIANGLE;
        assertEquals(expected, rs);
    }
    @Test
    void testTriangleClassifier823() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;

        String rs = TriangleClassifier.triangleClassifier(sideA,sideB,sideC);
        String expected = TriangleClassifier.NOT_A_TRIANGLE;
        assertEquals(expected, rs);
    }
    @Test
    void testTriangleClassifierNev121() {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;

        String rs = TriangleClassifier.triangleClassifier(sideA,sideB,sideC);
        String expected = TriangleClassifier.NOT_A_TRIANGLE;
        assertEquals(expected, rs);
    }
    @Test
    void testTriangleClassifier011() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;

        String rs = TriangleClassifier.triangleClassifier(sideA,sideB,sideC);
        String expected = TriangleClassifier.NOT_A_TRIANGLE;
        assertEquals(expected, rs);
    }




}