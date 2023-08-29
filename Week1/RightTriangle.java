public class RightTriangle {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean r = (((c > 0) && (a > 0) && (b > 0))
                && ((c * c == a * a + b * b) || (b * b == a * a + c * c) || (a * a == b * b
                        + c * c)));

        System.out.println(r);

    }

}