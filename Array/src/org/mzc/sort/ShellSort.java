package org.mzc.sort;

import java.util.Arrays;
//ϣ������
public class ShellSort {
	public static void shellSort(int[] arr) {
		//�������еĲ���
		for(int d = arr.length/2;d>0;d/=2) {
			//�������е�Ԫ��
			for(int i = d;i<arr.length;i++) {
				//�������������е�Ԫ��
				for(int j = i-d;j>=0;j-=d ) {
					//�����ǰԪ�ش��ڼ��ϲ�������Ǹ�Ԫ��
					if(arr[j]>arr[j+d]) {
						int temp = arr[j];
						arr[j] = arr[j+d];
						arr[j+d] = temp;
					}
				}
			}
		}
		
		
		
	} 
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,8,6,1,3,9,7,4};
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
