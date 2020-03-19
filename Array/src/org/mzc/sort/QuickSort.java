package org.mzc.sort;

import java.util.Arrays;
/**
 * ��������
 * @author ��
 *
 */
public class QuickSort {
	public  void quickSort(int[] arr,int start,int end) {
		if(start<end) {
		//�������еĵ�0��������Ϊ��׼��
		int stard = arr[start];
		//��¼��Ҫ������±�
		int low = start;
		int high = end;
		int a = 0;
		//ѭ���ұȱ�׼��������ͱȱ�׼��С����
		while(low<high) {
			a++;
			//�ұߵ����ֱȱ�׼��С����
			while(low<high&&stard<=arr[high]) {
				high--;
			}
			//ʹ���ұߵ������滻��ߵ���
			arr[low] = arr[high];
			//�����ߵ����ֱȱ�׼��С
			while(low<high&&arr[low]<=stard) {
				low++;
			}
			arr[high] = arr[low];
		}
		//�ѱ�׼�����������ڵ�λ��Ԫ��
		arr[low] = stard;
		//�������е�С������
		quickSort(arr,start,low);
//		//�������еĴ������
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
