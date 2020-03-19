package org.mzc.Stack;

public class Mystack {
	//ջ�ĵײ�����ʹ���������洢����
	int[] elements;
	public Mystack() {
		elements = new int[0];
	}
	
	//ѹ��Ԫ��
	public void push(int element) {
		//����һ���µ�����
		int[] newArry = new int[elements.length+1];
		//��ԭ�����е�Ԫ�ظ��Ƶ�������
		for(int i = 0;i<newArry.length-1;i++) {
			newArry[i] = elements[i];
		}
		//����ӵ�Ԫ�ط����µ�������
		newArry[elements.length] = element;
		//ʹ���������滻������
		elements = newArry;
	}
	
	//ȡ��ջ��Ԫ��
	public int pop() {
		//ջ��û��Ԫ��
		if(elements.length==0) {
			throw new RuntimeException("stack is empty");
		}
		//ȡ����������һ��Ԫ��
		int element = elements[elements.length-1];
		//����һ���µ�����
		int[] newArry = new int[elements.length-1];
		//ԭ�����г������һ��Ԫ�ص�����Ԫ�ض������µ�������
		for(int i = 0;i<elements.length-1;i++) {
			newArry[i] = elements[i];
		}
		//�滻����
		elements = newArry;
		//����ջ��Ԫ��
		return element;
	}
	//�鿴ջ��Ԫ��
	public int peck() {
		//ջ��û��Ԫ��
		if(elements.length==0) {
			throw new RuntimeException("stack is empty");
		}
		return elements[elements.length-1];
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpyty() {
		return elements.length==0;
	}

	public static void main(String[] args) {
		Mystack stack = new Mystack();
		stack.push(7);
		stack.push(8);
		stack.push(9);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpyty());
	}

}
