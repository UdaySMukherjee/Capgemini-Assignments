class Solution {
    public static int partition(int[] nums, int pivot, int end_index){
        int swap = pivot;
        int index = pivot+1;
        while(index<=end_index){
            if(nums[index]<nums[pivot]){
                int temp = nums[index];
                nums[index] = nums[pivot];
                nums[pivot] = temp;
            }
            index++;
        }
        int temp = nums[pivot];
        nums[pivot] = nums[swap];
        nums[swap] = temp;
        return swap;
    }
    public static void quicksort(int[] nums, int start, int end){
        if(start<end){
            int pivot = partition(nums,start,end);
            quicksort(nums,start,pivot-1);
            quicksort(nums,pivot+1,end);
        }
    }
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }
}
