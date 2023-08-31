public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] count = new int[m];
        int n = 0;
        double sum = 0.0;
        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            count[x - 1] += 1;
            n++;
        }
        for (int i = 0; i < m; i++) {

            if (count[i] != 0) {
                double prob = (double) count[i] / n;
                sum += -prob * (Math.log(prob) / Math.log(2));
            }

        }
        StdOut.printf("%1.4f\n", sum);
    }
}