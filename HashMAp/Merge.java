package array;

import java.util.Arrays;

public class Merge {
	
	public static void merge(int[] arr, int start, int mid, int end) {
		int leftArraySize = mid - start +1;
		int rightArraySize = end - mid;
		
		int[] leftArr = new int[leftArraySize];
		int[] rightArr = new int[rightArraySize];
		
		for(int i=0;i<leftArraySize;i++) {
			leftArr[i] = arr[start + i];
		}
		
		for(int i=0;i<rightArraySize;i++) {
			rightArr[i] = arr[mid + 1 + i];
		}
		
		int i=0, j=0, k=start;
		while(i<leftArraySize && j<rightArraySize) {
			if(leftArr[i]<rightArr[j]) {
				arr[k++] = leftArr[i++];
			}
			else {
				arr[k++] = rightArr[j++];
			}
		}
		while(i<leftArraySize) {
			arr[k++] = leftArr[i++];
		}
		while(j<rightArraySize) {
			arr[k++] = rightArr[j++];
		}
	}
	
	public static void mergesort(int[] arr, int start, int end) {
		if(start<end) {
			int mid = (start + end)/2;
			mergesort(arr, start,mid);
			mergesort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {7,5,2,0,3,7,8};
		mergesort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
}
