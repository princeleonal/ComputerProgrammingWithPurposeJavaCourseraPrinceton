public class RandomWalker {
    public static void main(String[] args) {
        double r = Integer.parseInt(args[0]);
        // initial coordinates
        int x = 0, y = 0, steps = 0;

        while (Math.abs(x) + Math.abs(y) < r) {
            double prob = Math.random();
            System.out.println("(" + x + ", " + y + ")");
            if (prob < 0.25)
                x--;
            else if (prob < 0.5)
                x++;
            else if (prob < 0.75)
                y--;
            else if (prob < 1.00)
                y++;
            steps++;

        }
        System.out.println("(" + x + ", " + y + ")");
        System.out.println("steps = " + steps);
    }

}