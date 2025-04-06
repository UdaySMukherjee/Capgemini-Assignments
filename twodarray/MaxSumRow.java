public class MaxSumRow {
    static final int R = 4, C = 4;

    public static void findMax1Row(int[][] mat) {
        int maxSumRow = 0, maxSum = -1;
        int currentSum;

        for (int i = 0; i < R; i++) {
            currentSum = 0;
            for (int j = 0; j < C; j++) {
                currentSum += mat[i][j];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxSumRow = i;
            }
        }
        System.out.println("Row : " + (maxSumRow + 1) + " has the maximum sum which is " + maxSum);
    }

    public static void main(String[] args) {
        int[][] mat = {{8, 4},{3, 5},{2, 4},{1, 2}};
        findMax1Row(mat);
    }
}
