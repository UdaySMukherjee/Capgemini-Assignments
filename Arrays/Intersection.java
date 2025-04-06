import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(result, k)));
    }
}
