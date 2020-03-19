package org.mzc.sort;

import java.util.Arrays;

//冒泡排序

public class Bubbling {
	
	public static void bubbleSort(int[] arr) {
		//控制共比较多少轮
		for(int i=0;i<arr.length-1;i++) {
			//控制比较的次数
			for(int j = 0;j<arr.length-1-i;j++ ) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int [] arr = new int[] {5,2,8,26,45,9,1};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

		
	}
}
