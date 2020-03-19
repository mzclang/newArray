package org.mzc.sort;

import java.util.Arrays;

import org.mzc.queue.MyQueue;
//ʹ�ö��еĻ�������
public class RedixQueueSort2 {

	public static void readixSort(int[] arr) {
		//�洢�����е���� ������
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		//������������Ǽ�Ϊ��
		int maxLength = (max+"").length();
		//������ʱ�洢���ݵĶ��е�����
		MyQueue[] temp = new MyQueue[10];
		//Ϊ�������鸳ֵ
		for(int i  = 0;i<temp.length;i++) {
			temp[i]  = new MyQueue();
		}
		
		//���ڼ�¼��temp����Ӧ�������д�ŵ����ֵ�����
		int[] counts = new int[10];
		
		//������󳤶ȵ��������ȽϵĴ���
		for(int i = 0,n = 1;i<maxLength;i++,n*=10) {
			//��ÿһ�����ֱַ��������
			for(int j = 0;j<arr.length;j++ ) {
				//��������
				int ys = arr[j]/n%10;
				//�ѵ�ǰ���������ݷ���ָ���Ķ�����
				temp[ys].add(arr[j]);
			}
			//��¼ȡ����Ԫ����Ҫ��� ��λ��
			int index= 0;
			//�����ж����е�����ȡ����
			for(int k = 0;k<temp.length;k++) {
				//ѭ��ȡ��Ԫ��
				while(!temp[k].isEmpty()) {
					//ȡ��Ԫ��
					arr[index] = temp[k].poll();

					//��¼��һ��λ��
					index++;
		
					//��������Ϊ0
					counts[k] = 0;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] arr = new int[] {2,22,222,5,52,520,89,69,34,1,9,7};
		readixSort(arr);
		System.out.println(Arrays.toString(arr));
	
	}

}
