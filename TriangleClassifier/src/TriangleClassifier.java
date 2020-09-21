
public class TriangleClassifier {
    public static final String EQUILATERAL_TRIANGLE = "tam giác đều";
    public static final String ISOSCELES_TRIANGLE = "tam giác cân";
    public static final String NORMAL_TRIANGLE = "tam giác thường";
    public static final String NOT_A_TRIANGLE = "không phải tam giác";

    public static String triangleClassifier(int sideA, int sideB, int sideC) {
        if (sideA <= 0 || sideC <= 0 ||sideB <= 0) return NOT_A_TRIANGLE;
        if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            return NOT_A_TRIANGLE;
        } else {
            if (sideA == sideB && sideA == sideC) {
                return EQUILATERAL_TRIANGLE;
            } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
                return ISOSCELES_TRIANGLE;
            } else return NORMAL_TRIANGLE;
        }
        //return "";
    }
}
