package org.mzc.sort;

import java.util.Arrays;
/**
 * ��������
 * @author ��
 *
 */
public class InsertSort {
	
	public static void insertSort2(int[] arr) {
		//�������е�����
		for(int i = 1;i<arr.length;i++) {
			//�����ǰ���ֱ�ǰһ������С
			if(arr[i]<arr[i-1]) {
				//�ѵ�ǰ�������ִ�����
				int temp = arr[i];
				int j;
				//������ǰ����ǰ�����е�����
				for( j=i-1;j>=0&&temp<arr[j];j--) {
					//��ǰһ�����ָ�����һ������
					arr[j+1] = arr[j];
				}
				//����ʱ����(���forѭ���ĵ�ǰԪ��)���������������ĺ�һ����
				arr[j+1] = temp;
				
			}
		}
	}
	
	
	public static void insertSort(int[] arr) {
		//�������е�����
		for(int i = 1;i<arr.length;i++) {
			//�����ǰ���ֱ�ǰһ������С
			if(arr[i]<arr[i-1]) {
				//�ѵ�ǰ�������ִ�����
				int temp = arr[i];
				int j;
				//������ǰ����ǰ�����е�����
				for( j=i;j>0&&temp<arr[j-1];j--) {
					//��ǰһ�����ָ�����һ������
					arr[j] = arr[j-1];
				}
				//����ʱ����(���forѭ���ĵ�ǰԪ��)���������������ĺ�һ����
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
