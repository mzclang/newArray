package org.mzc.sort;

import java.util.Arrays;
/**
 * 插入排序
 * @author 狼
 *
 */
public class InsertSort {
	
	public static void insertSort2(int[] arr) {
		//遍历所有的数字
		for(int i = 1;i<arr.length;i++) {
			//如果当前数字比前一个数字小
			if(arr[i]<arr[i-1]) {
				//把当前遍历数字存起来
				int temp = arr[i];
				int j;
				//遍历当前数字前面所有的数字
				for( j=i-1;j>=0&&temp<arr[j];j--) {
					//把前一个数字赋给后一个数字
					arr[j+1] = arr[j];
				}
				//把临时变量(外层for循环的当前元素)赋给不满足条件的后一个数
				arr[j+1] = temp;
				
			}
		}
	}
	
	
	public static void insertSort(int[] arr) {
		//遍历所有的数字
		for(int i = 1;i<arr.length;i++) {
			//如果当前数字比前一个数字小
			if(arr[i]<arr[i-1]) {
				//把当前遍历数字存起来
				int temp = arr[i];
				int j;
				//遍历当前数字前面所有的数字
				for( j=i;j>0&&temp<arr[j-1];j--) {
					//把前一个数字赋给后一个数字
					arr[j] = arr[j-1];
				}
				//把临时变量(外层for循环的当前元素)赋给不满足条件的后一个数
				arr[j] = temp;
				
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {7,8,5,2,6,0,9};
		insertSort2(arr);
		System.out.println(Arrays.toString(arr));
	}
}
