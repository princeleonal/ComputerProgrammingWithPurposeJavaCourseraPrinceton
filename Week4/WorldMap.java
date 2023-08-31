public class WorldMap {
    public static void main(String[] args) {
        int w = StdIn.readInt();
        int h = StdIn.readInt();
        StdDraw.setCanvasSize(w, h);
        StdDraw.setXscale(0.0, w);
        StdDraw.setYscale(0.0, h);
        StdDraw.enableDoubleBuffering();
        while (!StdIn.isEmpty()) {
            String n = StdIn.readString();
            int number = StdIn.readInt();
            double x[] = new double[number];
            double y[] = new double[number];
            for (int i = 0; i < number; i++) {
                x[i] = StdIn.readDouble();
                y[i] = StdIn.readDouble();
            }
            StdDraw.polygon(x, y);
        }
        StdDraw.show();
    }
}