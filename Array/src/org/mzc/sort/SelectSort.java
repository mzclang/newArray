package org.mzc.sort;

import java.util.Arrays;

public class SelectSort {
	//ѡ������
	public static void selectSort(int[] arr) {
		//�������е���
		for(int i = 0;i<arr.length;i++) {
			int minIndext = i;
			//�ѵ�ǰ���������ͺ������е������ν��бȽϣ�����¼����С�������±�
			for(int j = i+1;j<arr.length;j++) {
				//�������Ƚϵ����ȼ�¼����С����С
				if(arr[minIndext]>arr[j]) {
					//��¼����С���Ǹ������±�
					minIndext = j;
				}
			}
			//�����С�����͵�ǰ���������±겻һ��,˵���±�Ϊ minIndext �����ȵ�ǰ���� ������С
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
