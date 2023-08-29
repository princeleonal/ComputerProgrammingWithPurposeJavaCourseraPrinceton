
public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        int[][] count = new int[m][n];
        boolean[][] sweeper = new boolean[m][n];
        int[] neighbour = { -1, 0, 1 };
        int count_mines = 0;

        while (count_mines < k) {
            int x = (int) (Math.random() * m);
            int y = (int) (Math.random() * n);
            if (!(sweeper[x][y]))
                count_mines++;
            sweeper[x][y] = true;
        }

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[0].length; j++) {
                if (sweeper[i][j]) {

                    for (int dx = 0; dx < neighbour.length; dx++) {
                        for (int dy = 0; dy < neighbour.length; dy++) {
                            int new_x = i + neighbour[dx], new_y = j + neighbour[dy];
                            // dont consider the same point
                            if (!((new_x == i) && (new_y == j))) {
                                if ((new_x < m) && (0 <= new_x) && (new_y < n) && (0 <= new_y))
                                    count[new_x][new_y] += 1;

                            }

                        }

                    }
                }

            }
            // System.out.println();
        }

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[0].length; j++) {
                if (sweeper[i][j])
                    System.out.print("*  ");
                else
                    System.out.print(count[i][j] + "  ");
            }
            System.out.println();
        }
    }

}