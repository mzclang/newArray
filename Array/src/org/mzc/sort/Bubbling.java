package org.mzc.sort;

import java.util.Arrays;

//ð������

public class Bubbling {
	
	public static void bubbleSort(int[] arr) {
		//���ƹ��Ƚ϶�����
		for(int i=0;i<arr.length-1;i++) {
			//���ƱȽϵĴ���
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
