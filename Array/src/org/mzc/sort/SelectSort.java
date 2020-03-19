package org.mzc.sort;

import java.util.Arrays;

public class SelectSort {
	//选择排序
	public static void selectSort(int[] arr) {
		//遍历所有的数
		for(int i = 0;i<arr.length;i++) {
			int minIndext = i;
			//把当前遍历的数和后面所有的数依次进行比较，并记录下最小的数的下标
			for(int j = i+1;j<arr.length;j++) {
				//如果后面比较的数比记录的最小的数小
				if(arr[minIndext]>arr[j]) {
					//记录下最小的那个数的下标
					minIndext = j;
				}
			}
			//如果最小的数和当前遍历数的下标不一致,说明下标为 minIndext 的数比当前遍历 的数更小
			if(i!= minIndext) {
				int temp = arr[i];
				arr[i] = arr[minIndext];
				arr[minIndext] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {3,8,5,1,9,6,7,2,0,8};
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
