public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] s = new int[n];
        s[0] = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0)
                s[i] = s[i / 2];
            else
                s[i] = 1 - s[i - 1];

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i] == s[j])
                    System.out.print("+  ");
                else
                    System.out.print("-  ");

            }
            System.out.println();
        }

    }
}