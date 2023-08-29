public class RandomWalkers {
    public static void main(String[] args) {
        double r = Integer.parseInt(args[0]);
        double trials = Integer.parseInt(args[1]);
        // initial coordinates
        int totalSteps = 0;
        for (int i = 0; i < trials; i++) {
            int x = 0, y = 0;
            while (Math.abs(x) + Math.abs(y) < r) {
                double prob = Math.random();

                if (prob < 0.25)
                    x--;
                else if (prob < 0.5)
                    x++;
                else if (prob < 0.75)
                    y--;
                else if (prob < 1.00)
                    y++;
                totalSteps++;

            }

        }

        System.out.println("average number of steps = " + totalSteps / trials);
    }

}