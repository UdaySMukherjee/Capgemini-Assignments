package Assignment;

public class MaxWaterArea {
    public static void main(String[] args){
        int[] arr = {1,8,6,3,5,7,4,8,7,9};
        int rightIndex = arr.length-1;
        int leftIndex=0;
        int area=0;

        while(leftIndex<rightIndex){
            int length = arr[leftIndex]<arr[rightIndex]? arr[leftIndex]:arr[rightIndex];
            int width = rightIndex - leftIndex;
            area = (length * width)>area? (length * width):area;

            if(arr[leftIndex]<arr[rightIndex]){
                leftIndex++;
            }
            else{
                rightIndex--;
            }
        }
        System.out.println(area);
    }
}
