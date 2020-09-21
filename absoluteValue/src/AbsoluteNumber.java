public class AbsoluteNumber {
    public static int findAbsolute(int number){
        if (Math.abs(number / 2) <= Integer.MAX_VALUE/2) {
            if (number < 0)
                return -number;
            return number;
        }else return -0;
    }

}
