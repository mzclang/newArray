package org.mzc.sort;

import java.util.Arrays;
/**
 * 快速排序
 * @author 狼
 *
 */
public class QuickSort {
	public  void quickSort(int[] arr,int start,int end) {
		if(start<end) {
		//把数组中的第0个数字作为标准数
		int stard = arr[start];
		//记录需要排序的下标
		int low = start;
		int high = end;
		int a = 0;
		//循环找比标准数大的数和比标准数小的数
		while(low<high) {
			a++;
			//右边的数字比标准数小的数
			while(low<high&&stard<=arr[high]) {
				high--;
			}
			//使用右边的数字替换左边的数
			arr[low] = arr[high];
			//如果左边的数字比标准数小
			while(low<high&&arr[low]<=stard) {
				low++;
			}
			arr[high] = arr[low];
		}
		//把标准数赋给低所在的位置元素
		arr[low] = stard;
		//处理所有的小的数字
		quickSort(arr,start,low);
//		//处理所有的大的数字
		quickSort(arr, low+1, end);
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[] {2,5,3,1,6,9,7,4};
		QuickSort aaa = new QuickSort();
		aaa.quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
