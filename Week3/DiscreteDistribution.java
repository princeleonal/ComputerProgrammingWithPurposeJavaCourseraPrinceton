public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = args.length;
        int[] s = new int[n];

        s[0] = 0;
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + Integer.parseInt(args[i]);
            // System.out.println(S[i]);

        }

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * (s[n - 1]));

            int index = 0;
            for (int j = 1; j < n; j++) {
                if (r < s[j] && r >= s[j - 1]) {
                    index = j;

                }

            }
            System.out.print(index + " ");
        }
        // System.out.print("\n");
    }
}