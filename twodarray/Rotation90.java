public class Rotation90 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                // Save the top-left element
                int temp = arr[i][j];
                // Move values from left to top
                arr[i][j] = arr[n - 1 - j][i];
                // Move values from bottom to left
                arr[n - 1 - j][i] = arr[n - 1 - i][n - 1 - j];
                // Move values from right to bottom
                arr[n - 1 - i][n - 1 - j] = arr[j][n - 1 - i];
                // Assign temp (top-left) to right
                arr[j][n - 1 - i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}

