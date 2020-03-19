package org.mzc.tree.demo;

import java.util.Arrays;

//���㷨����
public class HeapSort {
	public static void maxHeap(int[] arr,int size,int index) {
		//���ӽڵ�
		int leftNode = 2*index+1;
		//���ӽڵ�
		int rightNode = 2*index+2;
		
		int max= index;
		//�������ӽڵ�ֱ�Աȣ��ҳ����Ľڵ�
		if(leftNode<size&&arr[leftNode]>arr[max]) {
			max = leftNode;
		}
		if(rightNode<size&&arr[rightNode]>arr[max]) {
			max = rightNode;
		}
		//����λ��
		if(max!=index) {
			int temp = arr[index];
			arr[index] = arr[max];
			arr[max] = temp;
			//����λ���Ժ󣬿��ܻ��ƻ�֮ǰ�źõĶѣ����ԣ�֮ǰ�źõĶ���Ҫ���µ���
			maxHeap(arr,size,max);
		}
		
	}
	
	public static void headSort(int[] data) {
		//��ʼλ�������һ����Ҷ�ӽڵ㣬�����һ���ڵ�ĸ��ڵ�
		int start = (data.length-1)/2;
		//����λ�ã����ݳ���-1,�����󶥶�
		for(int i = start;i>=0;i-- ) {
			maxHeap(data,data.length,i);
		}
		
		//�Ȱ������еĵ�0���Ͷ��е����һ��������λ�ã��ٰ�ǰ��Ĵ���Ϊ�󶥶�
		for(int i = data.length-1;i>0;i--) {
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			maxHeap(data,i,0);
		}
		
	}
	public static void main(String[] args) {
		int [] data = new int[] {9,6,8,7,0,1,10,4,2};
		headSort(data);
		System.out.println(Arrays.toString(data));
	}
}
