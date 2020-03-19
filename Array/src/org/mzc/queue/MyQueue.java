package org.mzc.queue;

public class MyQueue {
	int[] elements;
	public MyQueue() {
		elements = new int[0];
	}
	//����
	public void add(int element) {
		//����һ��������
		int[] newArry = new int[elements.length+1];
		//��ԭ�������е�Ԫ�ظ��Ƶ��µ�������
		for(int i = 0;i<elements.length;i++) {
			newArry[i] = elements[i];
		}
		//����ӵ�Ԫ�ط�����������
		newArry[elements.length] = element;
		//ʹ���µ������滻�ɵ�����
		elements = newArry;
	}
	//����
	public int poll() {
		//�������еĵ�0��Ԫ��ȡ����
		int element = elements[0];
		//����һ���µ�����
		int[] newArry = new int[elements.length-1];
		//����ԭ�����е�Ԫ�ص��µ�������
		for(int i = 0;i<newArry.length;i++) {
			newArry[i] = elements[i+1];
		}
		//�滻����
		elements = newArry;
		return element;
	}
	
	
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return elements.length==0;
	}
	
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue.poll());
		
	}
	
	
	
}
