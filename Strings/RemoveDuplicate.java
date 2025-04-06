package String;

import java.util.Scanner;

public class RemoveDuplicate {

    public static String removeDuplicates(String str) {
        int[] vis = new int[256];
        StringBuilder ans = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (vis[ch] == 0) {
                vis[ch] = 1;
                ans.append(ch);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] arr = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("\nStrings with Unique Characters:");
        for (String str : arr) {
            System.out.println(removeDuplicates(str));
        }

        sc.close();
    }
}
