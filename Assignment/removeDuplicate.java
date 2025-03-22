package Assignment;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int size = str.length();
        int[] vis = new int[123];
        String ans="";
        for(int i=0;i<size;i++){
            if(vis[str.charAt(i)]==0){
                vis[str.charAt(i)]++;
                ans=ans+str.charAt(i);
            }
        }
        System.out.println("String with Unique element: "+ans);
        sc.close();
    }
}
