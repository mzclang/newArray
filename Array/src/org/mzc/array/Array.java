package org.mzc.array;

public class Array {
	
	//�������Բ���
	public static void arr() {
		int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
		int target = 2;
		int index = -1;
		for(int i = 0;i<arr.length-1;i++) {
			if(target==arr[i]) {
				index = i;
				break;
			}
		}
		System.out.println("index:"+index);
		
	}
	
	
	//���ֲ���
	public static void  array() {
		//Ŀ��Ԫ��
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		//Ŀ��Ԫ��
		int target = 0;
		//��¼��ʼλ��
		int begin = 0;
		//��¼����λ��
		int end = arr.length-1;
		//��¼�м�λ��
		int mid = (begin+end)/2;
		//��¼Ŀ��λ��
		int index = -1;
		//ѭ������
		while(true) {
			//ʲô�����û�����Ԫ�أ�
			//��ʼ�ڽ���λ��֮��û�����Ԫ��
			if(begin>end) {
				break;
			}
			
			//�ж��м�����Ԫ���ǲ���Ҫ���ҵ�Ԫ��
			if(arr[mid]==target) {
				index = mid;
				break;
			}else {
				//�ж��м����Ԫ���ǲ��Ǳ�Ŀ��Ԫ�ش�
				if(arr[mid]>target) {
					//�ѽ��λ�õ������м�λ�õ�ǰһλ��
					end = mid-1;
					//�м����Ԫ�ر�Ŀ��Ԫ��ҪС
				}else {
					//�ѿ�ʼλ�õ������м�λ�õĺ�һ��λ��
					begin = mid+1;
				}
				//ȡ���µ��м�λ��
				mid = (begin+end)/2;
			}
		}
		System.out.println("��Ԫ�ص�λ���ǣ�"+index);
	}
	
	
	
	public static void main(String[] args) {
//		Array arr = new Array();
//		arr.array();
		arr();
	}

}
