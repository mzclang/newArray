package org.mzc.sort;

import java.util.Arrays;
/**
 * �鲢����
 * @author ��
 *
 */
public class MergeSort {
	public static void merge(int[] arr,int low,int middle,int high) {
		//���ڴ洢�鲢�����ʱ����
		int[] temp = new int[high-low+1];
		//��¼��һ����������Ҫ�������±�
		int i = low;
		//��¼�ڶ�����������Ҫ�������±�
		int j = middle+1;
		//���ڼ�¼����ʱ�����д�ŵ��±�
		int index= 0;
		//������������ȡ��С�����֣�������ʱ������
		while(i<=middle&&j<=high) {
			//��һ����������ݸ�С
			if(arr[i]<=arr[j]) {
				//��С�����ݷ�����ʱ����
				temp[index] = arr[i];
				//���±������һλ
				i++;		
			}else {
				temp[index] = arr[j];
				j++;
				
			}
			index++;
		}
		//������������
		while(j<=high) {
			temp[index] = arr[j];
			j++;
			index++;
		}
		while(i<=middle) {
			temp[index] = arr[i];
			i++;
			index++;
		}
		//����ʱ�����е��������´���ԭ����
		for(int k = 0;k<temp.length;k++) {
			arr[k+low] = temp[k];
		}
		
	}
	public static void mergeSort(int[] arr, int low ,int high) {
		int middle = (high+low)/2;
		if(low<high) {
			//�������
			mergeSort(arr,low,middle);
			//�����ұ�
			mergeSort(arr,middle+1,high);
			//�鲢
			merge(arr,low,middle,high);
		}
	}
	public static void main(String[] args) {
		int [] arr = new int [] {1,3,5,2,4,6,8,10,7,11,0,13};
//		merge(arr,0,2,arr.length-1);
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
